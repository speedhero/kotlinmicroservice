package io.kang.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConsulController {
    @GetMapping("hello/consul")
    fun helloConsul(): String {
        return "Hello Consul"
    }

}