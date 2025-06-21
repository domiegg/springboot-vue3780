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

import com.entity.XuexishipinEntity;
import com.entity.view.XuexishipinView;

import com.service.XuexishipinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 学习视频
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
@RestController
@RequestMapping("/xuexishipin")
public class XuexishipinController {
    @Autowired
    private XuexishipinService xuexishipinService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexishipinEntity xuexishipin,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xuexishipin.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuexishipinEntity> ew = new EntityWrapper<XuexishipinEntity>();

		PageUtils page = xuexishipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexishipin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexishipinEntity xuexishipin, 
		HttpServletRequest request){
        EntityWrapper<XuexishipinEntity> ew = new EntityWrapper<XuexishipinEntity>();

		PageUtils page = xuexishipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexishipin), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexishipinEntity xuexishipin){
       	EntityWrapper<XuexishipinEntity> ew = new EntityWrapper<XuexishipinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexishipin, "xuexishipin")); 
        return R.ok().put("data", xuexishipinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexishipinEntity xuexishipin){
        EntityWrapper< XuexishipinEntity> ew = new EntityWrapper< XuexishipinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexishipin, "xuexishipin")); 
		XuexishipinView xuexishipinView =  xuexishipinService.selectView(ew);
		return R.ok("查询学习视频成功").put("data", xuexishipinView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexishipinEntity xuexishipin = xuexishipinService.selectById(id);
		xuexishipin.setClicktime(new Date());
		xuexishipinService.updateById(xuexishipin);
        xuexishipin = xuexishipinService.selectView(new EntityWrapper<XuexishipinEntity>().eq("id", id));
        return R.ok().put("data", xuexishipin);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexishipinEntity xuexishipin = xuexishipinService.selectById(id);
		xuexishipin.setClicktime(new Date());
		xuexishipinService.updateById(xuexishipin);
        xuexishipin = xuexishipinService.selectView(new EntityWrapper<XuexishipinEntity>().eq("id", id));
        return R.ok().put("data", xuexishipin);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        XuexishipinEntity xuexishipin = xuexishipinService.selectById(id);
        if(type.equals("1")) {
        	xuexishipin.setThumbsupnum(xuexishipin.getThumbsupnum()+1);
        } else {
        	xuexishipin.setCrazilynum(xuexishipin.getCrazilynum()+1);
        }
        xuexishipinService.updateById(xuexishipin);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexishipin);
        xuexishipinService.insert(xuexishipin);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexishipin);
        xuexishipinService.insert(xuexishipin);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexishipinEntity xuexishipin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexishipin);
        xuexishipinService.updateById(xuexishipin);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexishipinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XuexishipinEntity xuexishipin, HttpServletRequest request,String pre){
        EntityWrapper<XuexishipinEntity> ew = new EntityWrapper<XuexishipinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = xuexishipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexishipin), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,XuexishipinEntity xuexishipin, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "kechengleixing";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "xuexishipin").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<XuexishipinEntity> xuexishipinList = new ArrayList<XuexishipinEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                xuexishipinList.addAll(xuexishipinService.selectList(new EntityWrapper<XuexishipinEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<XuexishipinEntity> ew = new EntityWrapper<XuexishipinEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = xuexishipinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexishipin), params), params));
        List<XuexishipinEntity> pageList = (List<XuexishipinEntity>)page.getList();
        if(xuexishipinList.size()<limit) {
            int toAddNum = (limit-xuexishipinList.size())<=pageList.size()?(limit-xuexishipinList.size()):pageList.size();
            for(XuexishipinEntity o1 : pageList) {
                boolean addFlag = true;
                for(XuexishipinEntity o2 : xuexishipinList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    xuexishipinList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(xuexishipinList.size()>limit) {
            xuexishipinList = xuexishipinList.subList(0, limit);
        }
        page.setList(xuexishipinList);
        return R.ok().put("data", page);
    }








}
