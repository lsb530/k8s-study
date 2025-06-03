package com.boki.demoz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class K8sBackendApplication

fun main(args: Array<String>) {
    runApplication<K8sBackendApplication>(*args)
}
