package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Slf4j
@SpringBootApplication
public class AddressbookAppBackendApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AddressbookAppBackendApplication.class, args);
        log.info(" Address Book App Started", context.getEnvironment().getProperty("environment"));
        log.info("Address Book DB User is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
    }
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bridgelabz.addressbook"))
                .build();
    }
}
