package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ²É¹ºÐÅÏ¢
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 20:17:04
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ²É¹ºµ¥id
	 */
	@TableId
	private Long id;
	/**
	 * ²É¹ºÈËid
	 */
	private Long assigneeId;
	/**
	 * ²É¹ºÈËÃû
	 */
	private String assigneeName;
	/**
	 * ÁªÏµ·½Ê½
	 */
	private String phone;
	/**
	 * ÓÅÏÈ¼¶
	 */
	private Integer priority;
	/**
	 * ×´Ì¬
	 */
	private Integer status;
	/**
	 * ²Ö¿âid
	 */
	private Long wareId;
	/**
	 * ×Ü½ð¶î
	 */
	private BigDecimal amount;
	/**
	 * ´´½¨ÈÕÆÚ
	 */
	private Date createTime;
	/**
	 * ¸üÐÂÈÕÆÚ
	 */
	private Date updateTime;

}
