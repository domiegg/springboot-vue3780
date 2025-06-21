package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShiyanshiguanliyuanEntity;
import com.entity.view.ShiyanshiguanliyuanView;

import com.service.ShiyanshiguanliyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室管理员
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
@RestController
@RequestMapping("/shiyanshiguanliyuan")
public class ShiyanshiguanliyuanController {
    @Autowired
    private ShiyanshiguanliyuanService shiyanshiguanliyuanService;




    
	@Autowired
	private TokenService tokenService;
	
	/**
	 * 登录
	 */
	@IgnoreAuth
	@RequestMapping(value = "/login")
	public R login(String username, String password, String captcha, HttpServletRequest request) {
		ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectOne(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("zhanghao", username));
		if(u==null || !u.getMima().equals(password)) {
			return R.error("账号或密码不正确");
		}
		
		String token = tokenService.generateToken(u.getId(), username,"shiyanshiguanliyuan",  "管理员" );
		return R.ok().put("token", token);
	}


	
	/**
     * 注册
     */
	@IgnoreAuth
    @RequestMapping("/register")
    public R register(@RequestBody ShiyanshiguanliyuanEntity shiyanshiguanliyuan){
    	//ValidatorUtils.validateEntity(shiyanshiguanliyuan);
    	ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectOne(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("guanliyuanxingming", shiyanshiguanliyuan.getGuanliyuanxingming()));
		if(u!=null) {
			return R.error("注册用户已存在");
		}
		Long uId = new Date().getTime();
		shiyanshiguanliyuan.setId(uId);
        shiyanshiguanliyuanService.insert(shiyanshiguanliyuan);
        return R.ok();
    }

	
	/**
	 * 退出
	 */
	@RequestMapping("/logout")
	public R logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return R.ok("退出成功");
	}
	
	/**
     * 获取用户的session用户信息
     */
    @RequestMapping("/session")
    public R getCurrUser(HttpServletRequest request){
    	Long id = (Long)request.getSession().getAttribute("userId");
        ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectById(id);
        return R.ok().put("data", u);
    }
    
    /**
     * 密码重置
     */
    @IgnoreAuth
	@RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request){
    	ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectOne(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("guanliyuanxingming", username));
    	if(u==null) {
    		return R.error("账号不存在");
    	}
        u.setMima("123456");
        shiyanshiguanliyuanService.updateById(u);
        return R.ok("密码已重置为：123456");
    }



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshiguanliyuanEntity shiyanshiguanliyuan,
		HttpServletRequest request){
        EntityWrapper<ShiyanshiguanliyuanEntity> ew = new EntityWrapper<ShiyanshiguanliyuanEntity>();

		PageUtils page = shiyanshiguanliyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiguanliyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshiguanliyuanEntity shiyanshiguanliyuan, 
		HttpServletRequest request){
        EntityWrapper<ShiyanshiguanliyuanEntity> ew = new EntityWrapper<ShiyanshiguanliyuanEntity>();

		PageUtils page = shiyanshiguanliyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshiguanliyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshiguanliyuanEntity shiyanshiguanliyuan){
       	EntityWrapper<ShiyanshiguanliyuanEntity> ew = new EntityWrapper<ShiyanshiguanliyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshiguanliyuan, "shiyanshiguanliyuan")); 
        return R.ok().put("data", shiyanshiguanliyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshiguanliyuanEntity shiyanshiguanliyuan){
        EntityWrapper< ShiyanshiguanliyuanEntity> ew = new EntityWrapper< ShiyanshiguanliyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshiguanliyuan, "shiyanshiguanliyuan")); 
		ShiyanshiguanliyuanView shiyanshiguanliyuanView =  shiyanshiguanliyuanService.selectView(ew);
		return R.ok("查询实验室管理员成功").put("data", shiyanshiguanliyuanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshiguanliyuanEntity shiyanshiguanliyuan = shiyanshiguanliyuanService.selectById(id);
        return R.ok().put("data", shiyanshiguanliyuan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshiguanliyuanEntity shiyanshiguanliyuan = shiyanshiguanliyuanService.selectById(id);
        return R.ok().put("data", shiyanshiguanliyuan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshiguanliyuanEntity shiyanshiguanliyuan, HttpServletRequest request){
        if(shiyanshiguanliyuanService.selectCount(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("zhanghao", shiyanshiguanliyuan.getZhanghao()))>0) {
            return R.error("账号已存在");
        }
    	shiyanshiguanliyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanshiguanliyuan);
    	ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectOne(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("guanliyuanxingming", shiyanshiguanliyuan.getGuanliyuanxingming()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shiyanshiguanliyuan.setId(new Date().getTime());
        shiyanshiguanliyuanService.insert(shiyanshiguanliyuan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshiguanliyuanEntity shiyanshiguanliyuan, HttpServletRequest request){
        if(shiyanshiguanliyuanService.selectCount(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("zhanghao", shiyanshiguanliyuan.getZhanghao()))>0) {
            return R.error("账号已存在");
        }
    	shiyanshiguanliyuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanshiguanliyuan);
    	ShiyanshiguanliyuanEntity u = shiyanshiguanliyuanService.selectOne(new EntityWrapper<ShiyanshiguanliyuanEntity>().eq("guanliyuanxingming", shiyanshiguanliyuan.getGuanliyuanxingming()));
		if(u!=null) {
			return R.error("用户已存在");
		}
		shiyanshiguanliyuan.setId(new Date().getTime());
        shiyanshiguanliyuanService.insert(shiyanshiguanliyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanshiguanliyuanEntity shiyanshiguanliyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshiguanliyuan);
        if(shiyanshiguanliyuanService.selectCount(new EntityWrapper<ShiyanshiguanliyuanEntity>().ne("id", shiyanshiguanliyuan.getId()).eq("zhanghao", shiyanshiguanliyuan.getZhanghao()))>0) {
            return R.error("账号已存在");
        }
        shiyanshiguanliyuanService.updateById(shiyanshiguanliyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanshiguanliyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
