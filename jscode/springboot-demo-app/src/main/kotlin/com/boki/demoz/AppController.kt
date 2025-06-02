package com.boki.demoz

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController {

    @Value("\${MY_ACCOUNT:default account}")
    private lateinit var myAccount: String

    @Value("\${MY_PASSWORD:default password}")
    private lateinit var myPassword: String

    @GetMapping
    fun home(): String {
        return "Version 1.1"
    }

    @GetMapping("/info")
    fun myInfo(): String {
        return "myAccount: $myAccount, myPassword: $myPassword"
    }

}