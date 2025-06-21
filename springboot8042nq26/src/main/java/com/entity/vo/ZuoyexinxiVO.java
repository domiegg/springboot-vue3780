package com.entity.vo;

import com.entity.ZuoyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业信息
 * @author 
 * @email 
 * @date 2024-04-12 10:48:34
 */
public class ZuoyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业类型
	 */
	
	private String zuoyeleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 作业文件
	 */
	
	private String zuoyewenjian;
		
	/**
	 * 作业要求
	 */
	
	private String zuoyeyaoqiu;
		
	/**
	 * 完成时间
	 */
	
	private String wanchengshijian;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
				
	
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
	 * 设置：作业文件
	 */
	 
	public void setZuoyewenjian(String zuoyewenjian) {
		this.zuoyewenjian = zuoyewenjian;
	}
	
	/**
	 * 获取：作业文件
	 */
	public String getZuoyewenjian() {
		return zuoyewenjian;
	}
				
	
	/**
	 * 设置：作业要求
	 */
	 
	public void setZuoyeyaoqiu(String zuoyeyaoqiu) {
		this.zuoyeyaoqiu = zuoyeyaoqiu;
	}
	
	/**
	 * 获取：作业要求
	 */
	public String getZuoyeyaoqiu() {
		return zuoyeyaoqiu;
	}
				
	
	/**
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(String wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public String getWanchengshijian() {
		return wanchengshijian;
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
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
			
}
