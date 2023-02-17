package com.peter.mall.member.dao;

import com.peter.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Runbo Fang
 * @email fangrunbo0606@gmail.com
 * @date 2023-02-17 00:39:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
