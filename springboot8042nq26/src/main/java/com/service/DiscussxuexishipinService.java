package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexishipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexishipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexishipinView;


/**
 * 学习视频评论表
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:48:35
 */
public interface DiscussxuexishipinService extends IService<DiscussxuexishipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexishipinVO> selectListVO(Wrapper<DiscussxuexishipinEntity> wrapper);
   	
   	DiscussxuexishipinVO selectVO(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);
   	
   	List<DiscussxuexishipinView> selectListView(Wrapper<DiscussxuexishipinEntity> wrapper);
   	
   	DiscussxuexishipinView selectView(@Param("ew") Wrapper<DiscussxuexishipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexishipinEntity> wrapper);

   	

}

