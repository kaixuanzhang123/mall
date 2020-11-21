package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Ê×Ò³ÂÖ²¥¹ã¸æ
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 00:21:39
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Longw id;
	/**
	 * Ãû×Ö
	 */
	private String name;
	/**
	 * Í¼Æ¬µØÖ·
	 */
	private String pic;
	/**
	 * ¿ªÊ¼Ê±¼ä
	 */
	private Date startTime;
	/**
	 * ½áÊøÊ±¼ä
	 */
	private Date endTime;
	/**
	 * ×´Ì¬
	 */
	private Integer status;
	/**
	 * µã»÷Êý
	 */
	private Integer clickCount;
	/**
	 * ¹ã¸æÏêÇéÁ¬½ÓµØÖ·
	 */
	private String url;
	/**
	 * ±¸×¢
	 */
	private String note;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;
	/**
	 * ·¢²¼Õß
	 */
	private Longw publisherId;
	/**
	 * ÉóºËÕß
	 */
	private Longw authId;

}
