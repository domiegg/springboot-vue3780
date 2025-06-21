package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyanshileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyanshileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyanshileixingView;


/**
 * 实验室类型
 *
 * @author 
 * @email 
 * @date 2024-04-12 10:48:33
 */
public interface ShiyanshileixingService extends IService<ShiyanshileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanshileixingVO> selectListVO(Wrapper<ShiyanshileixingEntity> wrapper);
   	
   	ShiyanshileixingVO selectVO(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);
   	
   	List<ShiyanshileixingView> selectListView(Wrapper<ShiyanshileixingEntity> wrapper);
   	
   	ShiyanshileixingView selectView(@Param("ew") Wrapper<ShiyanshileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanshileixingEntity> wrapper);

   	

}

