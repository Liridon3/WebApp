package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class DemoApplication



fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@RestController
class Message {
	@GetMapping("/")
	fun message() = "This"
}
