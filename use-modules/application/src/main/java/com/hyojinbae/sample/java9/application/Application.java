package com.hyojinbae.sample.java9.application;

import com.hyojinbae.sample.java9.api.HelloService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ServiceLoader;

public class Application {

    public static void main(String[] args) {
        ServiceLoader
                .load(HelloService.class)
                .forEach(service -> System.out.println(service.hello()))
                ;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu년 MM월 dd일 HH시 mm분 ss초");
        System.out.println("   - ITC인재교류회 제1회 정보공유회, "+ formatter.format(LocalDateTime.now()));
    }

}
