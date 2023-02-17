package com.peter.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peter.common.utils.PageUtils;
import com.peter.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-16 21:46:45
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

