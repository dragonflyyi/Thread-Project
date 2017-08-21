import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

/**
 * Created by dragonfly on 2017/7/9.N
 */
//@RestController
@EnableAutoConfiguration
@MapperScan("com.demo.dao")
@ComponentScan("com.demo")
@SpringBootApplication
public class MySpringBoot {


    public static void main(String[] args){
        System.out.println("Hello Spring Boot,  MySpringBoot is beginning.....!");
        SpringApplication.run(MySpringBoot.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("===========>Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

            System.out.println("================>Hello It's ok!");

        };
    }


}
