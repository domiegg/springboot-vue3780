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

import com.entity.ShiyanshileixingEntity;
import com.entity.view.ShiyanshileixingView;

import com.service.ShiyanshileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验室类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
@RestController
@RequestMapping("/shiyanshileixing")
public class ShiyanshileixingController {
    @Autowired
    private ShiyanshileixingService shiyanshileixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanshileixingEntity shiyanshileixing,
		HttpServletRequest request){
        EntityWrapper<ShiyanshileixingEntity> ew = new EntityWrapper<ShiyanshileixingEntity>();

		PageUtils page = shiyanshileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanshileixingEntity shiyanshileixing, 
		HttpServletRequest request){
        EntityWrapper<ShiyanshileixingEntity> ew = new EntityWrapper<ShiyanshileixingEntity>();

		PageUtils page = shiyanshileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanshileixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanshileixingEntity shiyanshileixing){
       	EntityWrapper<ShiyanshileixingEntity> ew = new EntityWrapper<ShiyanshileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanshileixing, "shiyanshileixing")); 
        return R.ok().put("data", shiyanshileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanshileixingEntity shiyanshileixing){
        EntityWrapper< ShiyanshileixingEntity> ew = new EntityWrapper< ShiyanshileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanshileixing, "shiyanshileixing")); 
		ShiyanshileixingView shiyanshileixingView =  shiyanshileixingService.selectView(ew);
		return R.ok("查询实验室类型成功").put("data", shiyanshileixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanshileixingEntity shiyanshileixing = shiyanshileixingService.selectById(id);
        return R.ok().put("data", shiyanshileixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanshileixingEntity shiyanshileixing = shiyanshileixingService.selectById(id);
        return R.ok().put("data", shiyanshileixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanshileixingEntity shiyanshileixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshileixing);
        shiyanshileixingService.insert(shiyanshileixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanshileixingEntity shiyanshileixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shiyanshileixing);
        shiyanshileixingService.insert(shiyanshileixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanshileixingEntity shiyanshileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanshileixing);
        shiyanshileixingService.updateById(shiyanshileixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanshileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
