package com.posgrado.ecommerce.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
    info = @Info(
        title = "Ecommerce Posgrado API",
        description = "Back Pack ecommerce",
        version = "1.0",
        contact = @Contact(
            name = "Posgrado",
            email = "no.reply.upea.posgrado@gmail.com"
        )
    )
)

@SecurityScheme(
    name = "bearerAuth",
    description = "Authentication JWT",
    scheme = "bearer",
    type = SecuritySchemeType.HTTP,
    bearerFormat = "JWT",
    in = SecuritySchemeIn.HEADER
)

@Configuration
public class SwaggerConfig {

}
