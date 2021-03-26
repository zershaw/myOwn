package com.czx.myownstumanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.czx.myownstumanager.mapper")

public class MyownstumanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyownstumanagerApplication.class, args);
    }

}
