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

import com.entity.KechengziliaoEntity;
import com.entity.view.KechengziliaoView;

import com.service.KechengziliaoService;
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
 * 课程资料
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
@RestController
@RequestMapping("/kechengziliao")
public class KechengziliaoController {
    @Autowired
    private KechengziliaoService kechengziliaoService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KechengziliaoEntity kechengziliao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			kechengziliao.setJiaoshixingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KechengziliaoEntity> ew = new EntityWrapper<KechengziliaoEntity>();

		PageUtils page = kechengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziliao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KechengziliaoEntity kechengziliao, 
		HttpServletRequest request){
        EntityWrapper<KechengziliaoEntity> ew = new EntityWrapper<KechengziliaoEntity>();

		PageUtils page = kechengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziliao), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KechengziliaoEntity kechengziliao){
       	EntityWrapper<KechengziliaoEntity> ew = new EntityWrapper<KechengziliaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kechengziliao, "kechengziliao")); 
        return R.ok().put("data", kechengziliaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KechengziliaoEntity kechengziliao){
        EntityWrapper< KechengziliaoEntity> ew = new EntityWrapper< KechengziliaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kechengziliao, "kechengziliao")); 
		KechengziliaoView kechengziliaoView =  kechengziliaoService.selectView(ew);
		return R.ok("查询课程资料成功").put("data", kechengziliaoView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        KechengziliaoEntity kechengziliao = kechengziliaoService.selectById(id);
		kechengziliao.setClicktime(new Date());
		kechengziliaoService.updateById(kechengziliao);
        kechengziliao = kechengziliaoService.selectView(new EntityWrapper<KechengziliaoEntity>().eq("id", id));
        return R.ok().put("data", kechengziliao);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        KechengziliaoEntity kechengziliao = kechengziliaoService.selectById(id);
		kechengziliao.setClicktime(new Date());
		kechengziliaoService.updateById(kechengziliao);
        kechengziliao = kechengziliaoService.selectView(new EntityWrapper<KechengziliaoEntity>().eq("id", id));
        return R.ok().put("data", kechengziliao);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        KechengziliaoEntity kechengziliao = kechengziliaoService.selectById(id);
        if(type.equals("1")) {
        	kechengziliao.setThumbsupnum(kechengziliao.getThumbsupnum()+1);
        } else {
        	kechengziliao.setCrazilynum(kechengziliao.getCrazilynum()+1);
        }
        kechengziliaoService.updateById(kechengziliao);
        return R.ok("投票成功");
    }

    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KechengziliaoEntity kechengziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kechengziliao);
        kechengziliaoService.insert(kechengziliao);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KechengziliaoEntity kechengziliao, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(kechengziliao);
        kechengziliaoService.insert(kechengziliao);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody KechengziliaoEntity kechengziliao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kechengziliao);
        kechengziliaoService.updateById(kechengziliao);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kechengziliaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前台智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,KechengziliaoEntity kechengziliao, HttpServletRequest request,String pre){
        EntityWrapper<KechengziliaoEntity> ew = new EntityWrapper<KechengziliaoEntity>();
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
		PageUtils page = kechengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziliao), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,KechengziliaoEntity kechengziliao, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "kechengleixing";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "kechengziliao").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<KechengziliaoEntity> kechengziliaoList = new ArrayList<KechengziliaoEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                kechengziliaoList.addAll(kechengziliaoService.selectList(new EntityWrapper<KechengziliaoEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<KechengziliaoEntity> ew = new EntityWrapper<KechengziliaoEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = kechengziliaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kechengziliao), params), params));
        List<KechengziliaoEntity> pageList = (List<KechengziliaoEntity>)page.getList();
        if(kechengziliaoList.size()<limit) {
            int toAddNum = (limit-kechengziliaoList.size())<=pageList.size()?(limit-kechengziliaoList.size()):pageList.size();
            for(KechengziliaoEntity o1 : pageList) {
                boolean addFlag = true;
                for(KechengziliaoEntity o2 : kechengziliaoList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    kechengziliaoList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(kechengziliaoList.size()>limit) {
            kechengziliaoList = kechengziliaoList.subList(0, limit);
        }
        page.setList(kechengziliaoList);
        return R.ok().put("data", page);
    }








}
