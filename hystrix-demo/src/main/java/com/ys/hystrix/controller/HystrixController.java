package com.ys.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试 hystrix 类
 *
 * @author yusheng
 * Created on 2020-05-14 20:25
 **/
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(HystrixController.class);

    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "errorHandle")
    public String get() {
        int i = 1;
        i = 1 / 0;
        // 出现异常[运行时异常(少)、网络波动、执行时间过长]，执行 errorHandle ，降级处理
        return "success";
    }

    private String errorHandle() {
        return "hystrix-demo";
    }


}
