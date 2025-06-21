package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexishipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexishipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexishipinView;


/**
 * 学习视频
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface XuexishipinService extends IService<XuexishipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexishipinVO> selectListVO(Wrapper<XuexishipinEntity> wrapper);
   	
   	XuexishipinVO selectVO(@Param("ew") Wrapper<XuexishipinEntity> wrapper);
   	
   	List<XuexishipinView> selectListView(Wrapper<XuexishipinEntity> wrapper);
   	
   	XuexishipinView selectView(@Param("ew") Wrapper<XuexishipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexishipinEntity> wrapper);

   	

}

