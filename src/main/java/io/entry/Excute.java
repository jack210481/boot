package io.entry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Excute {

    public static void main(String[] args){

        //这里执行结束，项目就启动了　下面的被@Bean的方法可以根据自己需求添加
        SpringApplication.run(Excute.class,args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        //传统spring项目中监听组件使用的是ApplicationListener
        //在springboot中使用的是ＣommandLineRunner　并且这个会自动帮你添加springboot中的组件
        // -> java8 中新增的表达式 lamuda
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
