package com.ys.goods.controller;

import com.ys.goods.domain.entity.Goods;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author yusheng
 * Created on 2020-05-07 20:12
 **/
@RestController
public class ProviderController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/goods")
    public String get(String id) {
        log.info(">>>> 服务提供方正常 <<<<");
        return "恭喜你，获得商品xxx {id:" + id + "}";
    }

    @PostMapping("/goods")
    public Map<String, Object> add(@RequestBody Map<String, Object> goods) {
        goods.put("id", "xxx");
        return goods;
    }

    @PostMapping("/goods/test")
    public Goods add(Goods goods) {
        log.info(">>>> 服务提供方接受正常 <<<<");
        System.out.println("goods = " + goods);
        goods.setType("测试品");
        return goods;
    }
}
