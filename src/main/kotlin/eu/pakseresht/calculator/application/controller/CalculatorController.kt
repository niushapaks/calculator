package eu.pakseresht.calculator.application.controller

import eu.pakseresht.calculator.application.dto.CalculatorOperation
import eu.pakseresht.calculator.domain.Calculator
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("calculator/api")
class CalculatorController {

    private val calculator = Calculator()

    @RequestMapping("/")
    fun home(): String {
        return "Welcome to calculator api"
    }

    @RequestMapping("/hello")
    fun helloWorld(): String {
        return "Hello, dear voyager"
    }

    @PostMapping
    fun postCalculatorOperation(@RequestBody operation: CalculatorOperation): CalculatorOperation {

        val calculatorOperation = operation.copy()
        calculatorOperation.result = calculator.compute(operation.operation, operation.a, operation.b)
        return calculatorOperation

    }

}