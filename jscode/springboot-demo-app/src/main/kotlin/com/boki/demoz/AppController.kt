package com.boki.demoz

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {

    @GetMapping
    fun home(): String {
        return "Version 1.1"
    }

}