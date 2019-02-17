package eu.pakseresht.calculator.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CalculatorApplication

fun main(args: Array<String>){
    runApplication<CalculatorApplication>(*args)
    println("Calculator launched")
}

