package com.peter.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.peter.mall.product.entity.BrandEntity;
import com.peter.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setDescript("test");
//        brandEntity.setName("huawei");
//        brandService.save(brandEntity);
//        System.out.println("保存成功。。。");

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("test2222");
//
//        brandService.updateById(brandEntity);
//        System.out.println("修改成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
