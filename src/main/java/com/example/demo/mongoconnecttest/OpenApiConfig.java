package com.example.demo.mongoconnecttest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring REST DOC API 명세서",
                description = "API 명세서",
                version = "v1",
                contact = @Contact(
                        name = "Jongsoo Kim",
                        email = "jskim5@enliple.com"
                )
        )
)
@Configuration
public class OpenApiConfig {
}