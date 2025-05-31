package com.boki.demoz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemozApplication

fun main(args: Array<String>) {
    runApplication<DemozApplication>(*args)
}
