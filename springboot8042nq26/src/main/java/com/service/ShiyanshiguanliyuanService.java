package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshiguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshiguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshiguanliyuanView;


/**
 * 实验室管理员
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface ShiyanshiguanliyuanService extends IService<ShiyanshiguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshiguanliyuanVO> selectListVO(Wrapper<ShiyanshiguanliyuanEntity> wrapper);
   	
   	ShiyanshiguanliyuanVO selectVO(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);
   	
   	List<ShiyanshiguanliyuanView> selectListView(Wrapper<ShiyanshiguanliyuanEntity> wrapper);
   	
   	ShiyanshiguanliyuanView selectView(@Param("ew") Wrapper<ShiyanshiguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshiguanliyuanEntity> wrapper);

   	

}

