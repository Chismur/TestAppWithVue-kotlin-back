package com.kotapp.exapp

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import java.util.*

@SpringBootApplication
class ExappApplicationKt

fun main(args: Array<String>) {
    runApplication<ExappApplicationKt>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
