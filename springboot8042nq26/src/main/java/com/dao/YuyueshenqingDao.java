package com.dao;

import com.entity.YuyueshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueshenqingVO;
import com.entity.view.YuyueshenqingView;


/**
 * 预约申请
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
public interface YuyueshenqingDao extends BaseMapper<YuyueshenqingEntity> {
	
	List<YuyueshenqingVO> selectListVO(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);
	
	YuyueshenqingVO selectVO(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);
	
	List<YuyueshenqingView> selectListView(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);

	List<YuyueshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);

	
	YuyueshenqingView selectView(@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyueshenqingEntity> wrapper);



}
