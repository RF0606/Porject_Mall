package com.peter.mall.order.dao;

import com.peter.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:44:56
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
