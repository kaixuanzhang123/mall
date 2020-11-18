package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Ethan
 * @email hongshengmo@163.com
 * @date 2020-05-27 15:38:36
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

