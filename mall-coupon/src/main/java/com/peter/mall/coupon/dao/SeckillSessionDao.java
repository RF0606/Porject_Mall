package com.peter.mall.coupon.dao;

import com.peter.mall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:31:28
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}