package com.dao;

import com.entity.ShiyanshiguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshiguanliyuanVO;
import com.entity.view.ShiyanshiguanliyuanView;


/**
 * 实验室管理员
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface ShiyanshiguanliyuanDao extends BaseMapper<ShiyanshiguanliyuanEntity> {
	
	List<ShiyanshiguanliyuanVO> selectListVO(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);
	
	ShiyanshiguanliyuanVO selectVO(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);
	
	List<ShiyanshiguanliyuanView> selectListView(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);

	List<ShiyanshiguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);

	
	ShiyanshiguanliyuanView selectView(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);
	

}
