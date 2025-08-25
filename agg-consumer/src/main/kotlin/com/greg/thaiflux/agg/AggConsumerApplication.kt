package com.greg.thaiflux.agg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AggConsumerApplication

fun main(args: Array<String>) {
    runApplication<AggConsumerApplication>(*args)
}