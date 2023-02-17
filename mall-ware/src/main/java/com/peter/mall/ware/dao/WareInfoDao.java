package com.peter.mall.ware.dao;

import com.peter.mall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:48:41
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
