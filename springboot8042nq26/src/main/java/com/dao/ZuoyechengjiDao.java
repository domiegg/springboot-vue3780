package com.dao;

import com.entity.ZuoyechengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoyechengjiVO;
import com.entity.view.ZuoyechengjiView;


/**
 * 作业成绩
 * 
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
public interface ZuoyechengjiDao extends BaseMapper<ZuoyechengjiEntity> {
	
	List<ZuoyechengjiVO> selectListVO(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);
	
	ZuoyechengjiVO selectVO(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);
	
	List<ZuoyechengjiView> selectListView(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);

	List<ZuoyechengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);

	
	ZuoyechengjiView selectView(@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);

    List<Map<String, Object>> fenshuSectionStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZuoyechengjiEntity> wrapper);


}
