package com.wdf.witness.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author by liuguangjin
 * @Description Swagger接口测试配置
 * @Date 20/10/19 16:32
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.wdf.witness"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("WDF项目后端接口")
                .description("wdf项目的接口测试文档")
                .build();
    }

//    swagger访问地址：http://localhost:9703/swagger-ui.html
}