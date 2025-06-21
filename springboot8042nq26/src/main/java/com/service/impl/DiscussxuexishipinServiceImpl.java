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


import com.dao.DiscussxuexishipinDao;
import com.entity.DiscussxuexishipinEntity;
import com.service.DiscussxuexishipinService;
import com.entity.vo.DiscussxuexishipinVO;
import com.entity.view.DiscussxuexishipinView;

@Service("discussxuexishipinService")
public class DiscussxuexishipinServiceImpl extends ServiceImpl<DiscussxuexishipinDao, DiscussxuexishipinEntity> implements DiscussxuexishipinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuexishipinEntity> page = this.selectPage(
                new Query<DiscussxuexishipinEntity>(params).getPage(),
                new EntityWrapper<DiscussxuexishipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuexishipinEntity> wrapper) {
		  Page<DiscussxuexishipinView> page =new Query<DiscussxuexishipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussxuexishipinVO> selectListVO(Wrapper<DiscussxuexishipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuexishipinVO selectVO(Wrapper<DiscussxuexishipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuexishipinView> selectListView(Wrapper<DiscussxuexishipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuexishipinView selectView(Wrapper<DiscussxuexishipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
