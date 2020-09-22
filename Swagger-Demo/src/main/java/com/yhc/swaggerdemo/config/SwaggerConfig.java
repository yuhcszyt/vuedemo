package com.yhc.swaggerdemo.config;

import com.yhc.swaggerdemo.util.SpringContext1Util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket docket(Environment environment) {

        Profiles profiles=Profiles.of("dev","test");
        boolean flag=environment.acceptsProfiles(profiles);
        ApplicationContext applicationContext= SpringContext1Util.getApplicationContext();
      //  Environment environment=applicationContext.getEnvironment();
       // String [] strings=environment.getActiveProfiles();
       // applicationContext.getEnvironment()
        return new Docket(DocumentationType.SWAGGER_2).enable(flag).select()
                .apis(RequestHandlerSelectors.basePackage("com.yhc.swaggerdemo.controller"))
                .build().apiInfo(getApiInfo()).groupName("yhc");
    }

    private ApiInfo getApiInfo() {

        Contact contact = new Contact("yuhc", "https://github.com/yuhcszyt/oa", "2502203@163.com");
        return new ApiInfo("yuhcSwaggerDemo", "this is yuhc swaggerDemo", "v1.0",
                "https://github.com/yuhcszyt/", contact, "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }
}

