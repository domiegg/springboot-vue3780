package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 作业成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
@TableName("zuoyechengji")
public class ZuoyechengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyechengjiEntity() {
		
	}
	
	public ZuoyechengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 作业名称
	 */
					
	private String zuoyemingcheng;
	
	/**
	 * 作业类型
	 */
					
	private String zuoyeleixing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 学生姓名
	 */
					
	private String xingming;
	
	/**
	 * 分数
	 */
					
	private Integer fenshu;
	
	/**
	 * 成绩
	 */
					
	private String chengji;
	
	/**
	 * 评语
	 */
					
	private String pingyu;
	
	/**
	 * 批改状况
	 */
					
	private String pigaizhuangkuang;
	
	/**
	 * 批改时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pigaishijian;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作业名称
	 */
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
	/**
	 * 设置：作业类型
	 */
	public void setZuoyeleixing(String zuoyeleixing) {
		this.zuoyeleixing = zuoyeleixing;
	}
	/**
	 * 获取：作业类型
	 */
	public String getZuoyeleixing() {
		return zuoyeleixing;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：分数
	 */
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
	/**
	 * 设置：成绩
	 */
	public void setChengji(String chengji) {
		this.chengji = chengji;
	}
	/**
	 * 获取：成绩
	 */
	public String getChengji() {
		return chengji;
	}
	/**
	 * 设置：评语
	 */
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
	/**
	 * 设置：批改状况
	 */
	public void setPigaizhuangkuang(String pigaizhuangkuang) {
		this.pigaizhuangkuang = pigaizhuangkuang;
	}
	/**
	 * 获取：批改状况
	 */
	public String getPigaizhuangkuang() {
		return pigaizhuangkuang;
	}
	/**
	 * 设置：批改时间
	 */
	public void setPigaishijian(Date pigaishijian) {
		this.pigaishijian = pigaishijian;
	}
	/**
	 * 获取：批改时间
	 */
	public Date getPigaishijian() {
		return pigaishijian;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}

}
