package com.entity.view;

import com.entity.DiscussxuexishipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 学习视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-12 10:48:35
 */
@TableName("discussxuexishipin")
public class DiscussxuexishipinView  extends DiscussxuexishipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuexishipinView(){
	}
 
 	public DiscussxuexishipinView(DiscussxuexishipinEntity discussxuexishipinEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuexishipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
