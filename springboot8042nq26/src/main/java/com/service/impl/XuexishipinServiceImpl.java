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


import com.dao.XuexishipinDao;
import com.entity.XuexishipinEntity;
import com.service.XuexishipinService;
import com.entity.vo.XuexishipinVO;
import com.entity.view.XuexishipinView;

@Service("xuexishipinService")
public class XuexishipinServiceImpl extends ServiceImpl<XuexishipinDao, XuexishipinEntity> implements XuexishipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexishipinEntity> page = this.selectPage(
                new Query<XuexishipinEntity>(params).getPage(),
                new EntityWrapper<XuexishipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexishipinEntity> wrapper) {
		  Page<XuexishipinView> page =new Query<XuexishipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XuexishipinVO> selectListVO(Wrapper<XuexishipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexishipinVO selectVO(Wrapper<XuexishipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexishipinView> selectListView(Wrapper<XuexishipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexishipinView selectView(Wrapper<XuexishipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
