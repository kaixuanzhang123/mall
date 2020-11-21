package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÓÅ»ÝÈ¯·ÖÀà¹ØÁª
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 00:21:38
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Longw id;
	/**
	 * ÓÅ»ÝÈ¯id
	 */
	private Longw couponId;
	/**
	 * ²úÆ··ÖÀàid
	 */
	private Longw categoryId;
	/**
	 * ²úÆ··ÖÀàÃû³Æ
	 */
	private String categoryName;

}
