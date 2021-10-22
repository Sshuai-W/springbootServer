package com.shuai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringbootServer
 * @Description TODO
 * @Author weis
 * @Date 2021/10/22 10:22
 * @Version
 */
@SpringBootApplication
@MapperScan("com.shuai.dao")
public class SpringbootServer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServer.class);
    }

}
