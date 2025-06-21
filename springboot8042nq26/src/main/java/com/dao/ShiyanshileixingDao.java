package com.dao;

import com.entity.ShiyanshileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyanshileixingVO;
import com.entity.view.ShiyanshileixingView;


/**
 * 实验室类型
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface ShiyanshileixingDao extends BaseMapper<ShiyanshileixingEntity> {
	
	List<ShiyanshileixingVO> selectListVO(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);
	
	ShiyanshileixingVO selectVO(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);
	
	List<ShiyanshileixingView> selectListView(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);

	List<ShiyanshileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);

	
	ShiyanshileixingView selectView(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);
	

}
