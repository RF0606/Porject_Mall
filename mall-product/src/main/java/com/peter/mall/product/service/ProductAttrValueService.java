package com.peter.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.peter.common.utils.PageUtils;
import com.peter.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-16 21:46:45
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

