package com.ys.user.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring cloud框架默认启动Ribbon模块，默认策略为轮训
 * 但推荐修改策略为响应时间权重策略
 *
 * @author yusheng
 * Created on 2020-05-07
 */
@Configuration
public class RibbonGlobalLoadBalancingConfiguration {
    @Bean
    public IRule ribbonRule() {
        return new WeightedResponseTimeRule();
    }
}
