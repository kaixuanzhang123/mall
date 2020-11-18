package com.atguigu.gulimall.product.feign.fallback;

import com.atguigu.gulimall.product.feign.SeckillFeignService;
import io.niceseason.common.exception.BizCodeEnum;
import io.niceseason.common.utils.R;
import org.springframework.stereotype.Component;

@Component
public class SeckillFallbackService implements SeckillFeignService {
    @Override
    public R getSeckillSkuInfo(Long skuId) {
        return R.error(BizCodeEnum.READ_TIME_OUT_EXCEPTION.getCode(), BizCodeEnum.READ_TIME_OUT_EXCEPTION.getMsg());
    }
}
