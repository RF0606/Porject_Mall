package com.peter.mall.order.dao;

import com.peter.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:44:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
