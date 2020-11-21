package com.atguigu.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ÉÌÆ·spu»ý·ÖÉèÖÃ
 * 
 * @author kaikai
 * @email 1552121244qq.com
 * @date 2020-11-22 00:21:38
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Longw id;
	/**
	 * 
	 */
	private Longw spuId;
	/**
	 * ³É³¤»ý·Ö
	 */
	private BigDecimal growBounds;
	/**
	 * ¹ºÎï»ý·Ö
	 */
	private BigDecimal buyBounds;
	/**
	 * ÓÅ»ÝÉúÐ§Çé¿ö[1111£¨ËÄ¸ö×´Ì¬Î»£¬´ÓÓÒµ½×ó£©;0 - ÎÞÓÅ»Ý£¬³É³¤»ý·ÖÊÇ·ñÔùËÍ;1 - ÎÞÓÅ»Ý£¬¹ºÎï»ý·ÖÊÇ·ñÔùËÍ;2 - ÓÐÓÅ»Ý£¬³É³¤»ý·ÖÊÇ·ñÔùËÍ;3 - ÓÐÓÅ»Ý£¬¹ºÎï»ý·ÖÊÇ·ñÔùËÍ¡¾×´Ì¬Î»0£º²»ÔùËÍ£¬1£ºÔùËÍ¡¿]
	 */
	private Integer work;

}
