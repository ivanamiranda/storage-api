package com.ivanamiranda.storage_api.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Storage Cloud API")
                    .version("1.0")
                    .description("API REST para upload e gerenciamento de arquivos utilizando AWS S3")
            )
    }
}