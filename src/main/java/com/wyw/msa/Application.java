package com.wyw.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wangyw
 * @date 2019/11/13
 */
@SpringBootApplication
/*
 * 扫描mapper接口
 */
@MapperScan("com.wyw.msa.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
