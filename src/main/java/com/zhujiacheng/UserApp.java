package com.zhujiacheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author Mr zhu
 * @Date 2020/10/15 20:54
 */
@SpringBootApplication
@MapperScan("com.zhujiacheng.dao")
@EnableScheduling
public class UserApp {

    public static void main(String[] args) {

        SpringApplication.run(UserApp.class,args);

    }

}
