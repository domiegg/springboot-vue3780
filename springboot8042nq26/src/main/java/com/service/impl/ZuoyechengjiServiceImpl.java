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


import com.dao.ZuoyechengjiDao;
import com.entity.ZuoyechengjiEntity;
import com.service.ZuoyechengjiService;
import com.entity.vo.ZuoyechengjiVO;
import com.entity.view.ZuoyechengjiView;

@Service("zuoyechengjiService")
public class ZuoyechengjiServiceImpl extends ServiceImpl<ZuoyechengjiDao, ZuoyechengjiEntity> implements ZuoyechengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoyechengjiEntity> page = this.selectPage(
                new Query<ZuoyechengjiEntity>(params).getPage(),
                new EntityWrapper<ZuoyechengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoyechengjiEntity> wrapper) {
		  Page<ZuoyechengjiView> page =new Query<ZuoyechengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZuoyechengjiVO> selectListVO(Wrapper<ZuoyechengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoyechengjiVO selectVO(Wrapper<ZuoyechengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoyechengjiView> selectListView(Wrapper<ZuoyechengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoyechengjiView selectView(Wrapper<ZuoyechengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZuoyechengjiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZuoyechengjiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZuoyechengjiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> fenshuSectionStat(Map<String, Object> params, Wrapper<ZuoyechengjiEntity> wrapper) {
        return baseMapper.fenshuSectionStat(params, wrapper);
    }



}
