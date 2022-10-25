package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Practice {

    @GetMapping()  //anotaciones
    fun index(): String {
        val age: Int =18
        if(age>=18){

            return ("soy mayor de edad: $age años")
        }else
            return ("Soy menor de edad: $age años")
    }

    @GetMapping("/{age}")  //anotaciones
/////////////////////When///////TAREA/////////////////
    fun indexAge(@PathVariable age:Int): String {
        val s = when (age) {
            in 0..11 -> "niño"
            in 12..17 -> "adolescente"
            in 18..21 -> "adulto joven"
            in 22..64 -> "Adulto"
            in 65..100 -> "tercera edad"

            else -> "ingrese la edad"
        }
        return s
    }
}