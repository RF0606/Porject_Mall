package com.peter.mall.product.dao;

import com.peter.mall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-16 21:46:45
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
