package com.kotapp.exapp.controller

import com.kotapp.exapp.exceprions.NotFoundException
import io.swagger.annotations.Api
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/message")
@Api(value = "/api/message", description = "controller for the basic operations with messages")
class MessageController {

    val listOfMap = mutableListOf(
            mutableMapOf("id" to "0", "text" to "m0"),
            mutableMapOf("id" to "1", "text" to "m1"),
            mutableMapOf("id" to "12", "text" to "m12"),
            mutableMapOf("id" to "2", "text" to "m2"))

    @GetMapping
    fun getAllMessages(): List<Map<String, String>> {
        return listOfMap
    }

    @GetMapping("{id}")
    fun getMessage(@PathVariable(value = "id", required = true) id: String): Map<String, String> {
        return gerMessageById(id)
    }

    @PostMapping("/add")
    fun addMessage(@RequestBody message: MutableMap<String, String>): Map<String, String> {
        listOfMap.add(message)
        return message
    }

    @PutMapping("{id}")
    fun updateMessage(@PathVariable id: String,
                      @RequestBody message: MutableMap<String, String>): Map<String, String> {
        val messageFromDB = gerMessageById(id)
        messageFromDB.putAll(message)
        return messageFromDB
    }

    @DeleteMapping("{id}")
    fun deleteMessage(@PathVariable id: String) {
        listOfMap.remove(gerMessageById(id))
    }

    private fun gerMessageById(id: String) = listOfMap.firstOrNull { id == it["id"] } ?: throw NotFoundException()
}