package com.ys.user.controller;

import com.ys.user.domain.entity.Goods;
import com.ys.user.feign.GoodsFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yusheng
 * Created on 2020-05-07 20:47
 **/
@RequestMapping("/user")
@RestController
public class UserController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);

    @Resource
    private GoodsFeign goodsFeign;

    @GetMapping("/test")
    public void get() {
        // 测试远程调用
        log.info(">>>> 服务消费方正常start <<<<");
        String goods = goodsFeign.getGoods("1111");
        System.out.println("goods = " + goods);
        Map<String, Object> map = new HashMap<>();
        map.put("name", "测试品");
        Map<String, Object> body = goodsFeign.addGoods(map);
        System.out.println("body = " + body);
        log.info(">>>> 服务消费方正常end <<<<");
    }

    @GetMapping("/test2")
    public void get2() {
        // 测试远程调用
        log.info(">>>> 服务消费方正常start <<<<");
        Goods goods = goodsFeign.test(new Goods(1123, "测试用例", null, null));
        System.out.println("goods = " + goods);
        log.info(">>>> 服务消费方正常end <<<<");
    }
}
