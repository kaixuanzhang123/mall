package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ¿â´æ¹¤×÷µ¥
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 20:17:04
 */
@Data
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetailEntity implements Serializable {
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
	 * sku_name
	 */
	private String skuName;
	/**
	 * ¹ºÂò¸öÊý
	 */
	private Integer skuNum;
	/**
	 * ¹¤×÷µ¥id
	 */
	private Long taskId;

}
