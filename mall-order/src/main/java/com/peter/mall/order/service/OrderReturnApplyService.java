package com.peter.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peter.common.utils.PageUtils;
import com.peter.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:44:56
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

