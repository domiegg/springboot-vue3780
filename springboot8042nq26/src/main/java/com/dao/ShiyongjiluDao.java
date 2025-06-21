package com.dao;

import com.entity.ShiyongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyongjiluVO;
import com.entity.view.ShiyongjiluView;


/**
 * 使用记录
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
public interface ShiyongjiluDao extends BaseMapper<ShiyongjiluEntity> {
	
	List<ShiyongjiluVO> selectListVO(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);
	
	ShiyongjiluVO selectVO(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);
	
	List<ShiyongjiluView> selectListView(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);

	List<ShiyongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);

	
	ShiyongjiluView selectView(@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyongjiluEntity> wrapper);



}
