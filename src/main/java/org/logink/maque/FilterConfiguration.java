package org.logink.maque;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jidanyin.
 */
@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean filterDemo4Registration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //注入过滤器
        registration.setFilter(new DemoFilter());
        //拦截规则
        registration.addUrlPatterns("/*");
        //过滤器名称
        registration.setName("DemoFilter");
        //是否自动注册 false 取消Filter的自动注册
        registration.setEnabled(true);
        //过滤器顺序
        registration.setOrder(1);
        return registration;
    }

}
