package com.gcb.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 高淙博
 * @data 2020/06/09 12:50
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.gcb.exam.mapper")
public class CarApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class,args);
    }
}
