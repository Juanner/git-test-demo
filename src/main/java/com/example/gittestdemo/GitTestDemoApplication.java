package com.example.gittestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestDemoApplication.class, args);
        int i = 1;
        System.out.println(i);
        System.out.println(i + 1);
        System.out.println(i + 2);
        System.out.println(i + "fenzhi1 ");
        System.out.println(i+"github");
    }


}
