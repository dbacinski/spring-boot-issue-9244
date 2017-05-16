package com.example.facade

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration
import org.springframework.context.annotation.PropertySource

@SpringBootApplication(scanBasePackages = arrayOf("com.example"),
        exclude = arrayOf(DataSourceAutoConfiguration::class, JooqAutoConfiguration::class))
@PropertySource("classpath:xxx.properties", "classpath:application.properties")
class FacadeApplication

fun main(args: Array<String>) {
    SpringApplication.run(FacadeApplication::class.java, *args)
}

