package com.gcb.exam;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 高淙博
 * @data 2020/06/09 10:03
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.gcb.exam.mapper")
public class VipApplication {
    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class, args);
    }
}
