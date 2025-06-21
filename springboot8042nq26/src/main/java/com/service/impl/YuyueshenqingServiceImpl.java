package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuyueshenqingDao;
import com.entity.YuyueshenqingEntity;
import com.service.YuyueshenqingService;
import com.entity.vo.YuyueshenqingVO;
import com.entity.view.YuyueshenqingView;

@Service("yuyueshenqingService")
public class YuyueshenqingServiceImpl extends ServiceImpl<YuyueshenqingDao, YuyueshenqingEntity> implements YuyueshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyueshenqingEntity> page = this.selectPage(
                new Query<YuyueshenqingEntity>(params).getPage(),
                new EntityWrapper<YuyueshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyueshenqingEntity> wrapper) {
		  Page<YuyueshenqingView> page =new Query<YuyueshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YuyueshenqingVO> selectListVO(Wrapper<YuyueshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyueshenqingVO selectVO(Wrapper<YuyueshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyueshenqingView> selectListView(Wrapper<YuyueshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyueshenqingView selectView(Wrapper<YuyueshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuyueshenqingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuyueshenqingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuyueshenqingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
