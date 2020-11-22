package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·¿â´æ
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 20:17:04
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ²Ö¿âid
	 */
	private Long wareId;
	/**
	 * ¿â´æÊý
	 */
	private Integer stock;
	/**
	 * sku_name
	 */
	private String skuName;
	/**
	 * Ëø¶¨¿â´æ
	 */
	private Integer stockLocked;

}
