package eu.pakseresht.calculator.application.dto

import java.util.*

data class CalculatorOperation(val operation: String, val a: Int, val b: Int) {
    var id: String = UUID.randomUUID().toString()
    var result: Int = 0
}
