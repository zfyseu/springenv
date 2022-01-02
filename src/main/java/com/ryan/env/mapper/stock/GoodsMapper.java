package com.ryan.env.mapper.stock;

import com.ryan.env.model.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    Goods queryById(Long id);
}
