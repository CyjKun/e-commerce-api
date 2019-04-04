package com.ecommerce.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class EcommerceApplication

fun main(args: Array<String>) {
	runApplication<EcommerceApplication>(*args)
}
