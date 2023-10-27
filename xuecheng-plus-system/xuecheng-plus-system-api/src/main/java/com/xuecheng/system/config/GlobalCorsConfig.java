package com.xuecheng.system.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Collections;

/**
 * 跨域过滤器
 *
 * @author maxinkai
 * @date 2023/10/26 11:25
 **/
@Configuration
public class GlobalCorsConfig {

    // 允许跨域调用的过滤器
    // @Bean
    // public CorsFilter corsFilter() {
    //     CorsConfiguration config = new CorsConfiguration();
    //     // 允许白名单域名进行跨域调用
    //     config.addAllowedOrigin("*");
    //     // 允许跨越发送cookie
    //     config.setAllowCredentials(true);
    //     // 放行全部原始头信息
    //     config.addAllowedHeader("*");
    //     // 允许所有请求方法跨域调用
    //     config.addAllowedMethod("*");
    //     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    //     source.registerCorsConfiguration("/**", config);
    //     return new CorsFilter(source);
    // }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 1.允许任何来源
        corsConfiguration.setAllowedOrigins(Collections.singletonList("*"));
        // 2.允许任何请求头
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
        // 3.允许任何方法
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);
        // 4.允许凭证
        corsConfiguration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);
        CorsFilter corsFilter = new CorsFilter(source);

        FilterRegistrationBean<CorsFilter> filterRegistrationBean = new FilterRegistrationBean<>(corsFilter);
        filterRegistrationBean.setOrder(-101);  // 小于 SpringSecurity Filter的 Order(-100) 即可

        return filterRegistrationBean;
    }
}
