package com.airbook.airbook;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;







@SpringBootApplication()
public class AirbookApplication {
    public static void main(String[] args){

        SpringApplication.run(AirbookApplication.class, args);

    }





}



