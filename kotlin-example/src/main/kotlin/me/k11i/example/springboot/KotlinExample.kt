package me.k11i.example.springboot

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@SpringBootApplication
@Component
@ConfigurationProperties("example-app.kotlin")
open class KotlinExample : CommandLineRunner {
    /** A message to log */
    lateinit var message: String

    override fun run(vararg args: String?) {
        val logger = LoggerFactory.getLogger(KotlinExample::class.java)
        logger.info(message)
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinExample::class.java, *args)
}