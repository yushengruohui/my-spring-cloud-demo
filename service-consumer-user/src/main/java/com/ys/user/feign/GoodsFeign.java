package com.ys.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author yusheng
 * Created on 2020-05-07 20:49
 **/
@FeignClient(value = "service-provider-goods", path = "/goods")
public interface GoodsFeign {

    // 不支持 @GettingMapper、@PostMapping 等注释。
    @RequestMapping(value = "", method = RequestMethod.GET)
    // @RequestParam，基础数据类型参数，一定要加上该注释
    String getGoods(@RequestParam("id") String id);

    // @RequestBody 该注解每个方法最多只能传递一个对象，如果参数前没有调用注释，默认添加@RequestBody
    @RequestMapping(value = "", method = RequestMethod.POST)
    // @RequestBody，引用数据类型参数，一定要加上该注释，同时，服务提供方也要加上该注释才能正常接受
    Map<String, Object> addGoods(Map<String, Object> goods);
}
