package com.dao;

import com.entity.XuexishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexishipinVO;
import com.entity.view.XuexishipinView;


/**
 * 学习视频
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface XuexishipinDao extends BaseMapper<XuexishipinEntity> {
	
	List<XuexishipinVO> selectListVO(@Param("ew") Wrapper<XuexishipinEntity> wrapper);
	
	XuexishipinVO selectVO(@Param("ew") Wrapper<XuexishipinEntity> wrapper);
	
	List<XuexishipinView> selectListView(@Param("ew") Wrapper<XuexishipinEntity> wrapper);

	List<XuexishipinView> selectListView(Pagination page,@Param("ew") Wrapper<XuexishipinEntity> wrapper);

	
	XuexishipinView selectView(@Param("ew") Wrapper<XuexishipinEntity> wrapper);
	

}
