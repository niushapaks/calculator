package eu.pakseresht.calculator.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("calculator/api")
class CalculatorController {

    @RequestMapping("/")
    fun home(): String{
        return "Welcome to calculator api"
    }

    @RequestMapping("/hello")
    fun helloWorld(): String {
        return "Hello, dear voyager"
    }

}