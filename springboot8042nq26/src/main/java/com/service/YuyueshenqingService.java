package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueshenqingView;


/**
 * 预约申请
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
public interface YuyueshenqingService extends IService<YuyueshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueshenqingVO> selectListVO(Wrapper<YuyueshenqingEntity> wrapper);
   	
   	YuyueshenqingVO selectVO(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);
   	
   	List<YuyueshenqingView> selectListView(Wrapper<YuyueshenqingEntity> wrapper);
   	
   	YuyueshenqingView selectView(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueshenqingEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YuyueshenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YuyueshenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YuyueshenqingEntity> wrapper);



}

