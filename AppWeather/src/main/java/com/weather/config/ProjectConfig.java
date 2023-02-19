package com.weather.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "controllers")
@EnableFeignClients(basePackages = "proxy")
public class ProjectConfig {
}