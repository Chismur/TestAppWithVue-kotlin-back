package com.kotapp.exapp.controller

import com.kotapp.exapp.model.Greeting
import org.springframework.web.bind.annotation.*
import kotlin.random.Random

@RestController
@RequestMapping(("/api"))
class MainController{

    @GetMapping("/greetings")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(Random.nextLong(0, 20), "Hello, $name")
    }
}