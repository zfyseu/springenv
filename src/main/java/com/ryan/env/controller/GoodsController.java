package com.ryan.env.controller;

import com.ryan.env.mapper.stock.GoodsMapper;
import com.ryan.env.model.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class GoodsController {
    @Resource
    private GoodsMapper goodsMapper;

    @ResponseBody()
    @RequestMapping("getGoodsById")
    public String getGoodsById(@RequestParam(value = "goodsId") Long goodsId) {
        Goods goods = goodsMapper.queryById(goodsId);
        if (goods == null) {
            return "not found";
        }
        return goods.getName() + " " + goods.getBrand();
    }

}
