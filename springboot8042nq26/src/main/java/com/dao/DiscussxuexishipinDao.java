package com.dao;

import com.entity.DiscussxuexishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexishipinVO;
import com.entity.view.DiscussxuexishipinView;


/**
 * 学习视频评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:35
 */
public interface DiscussxuexishipinDao extends BaseMapper<DiscussxuexishipinEntity> {
	
	List<DiscussxuexishipinVO> selectListVO(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);
	
	DiscussxuexishipinVO selectVO(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);
	
	List<DiscussxuexishipinView> selectListView(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);

	List<DiscussxuexishipinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);

	
	DiscussxuexishipinView selectView(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);
	

}
