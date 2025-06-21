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


import com.dao.ShiyanshiguanliyuanDao;
import com.entity.ShiyanshiguanliyuanEntity;
import com.service.ShiyanshiguanliyuanService;
import com.entity.vo.ShiyanshiguanliyuanVO;
import com.entity.view.ShiyanshiguanliyuanView;

@Service("shiyanshiguanliyuanService")
public class ShiyanshiguanliyuanServiceImpl extends ServiceImpl<ShiyanshiguanliyuanDao, ShiyanshiguanliyuanEntity> implements ShiyanshiguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyanshiguanliyuanEntity> page = this.selectPage(
                new Query<ShiyanshiguanliyuanEntity>(params).getPage(),
                new EntityWrapper<ShiyanshiguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyanshiguanliyuanEntity> wrapper) {
		  Page<ShiyanshiguanliyuanView> page =new Query<ShiyanshiguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShiyanshiguanliyuanVO> selectListVO(Wrapper<ShiyanshiguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyanshiguanliyuanVO selectVO(Wrapper<ShiyanshiguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyanshiguanliyuanView> selectListView(Wrapper<ShiyanshiguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyanshiguanliyuanView selectView(Wrapper<ShiyanshiguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
