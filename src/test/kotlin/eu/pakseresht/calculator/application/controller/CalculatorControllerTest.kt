package eu.pakseresht.calculator.application.controller

import eu.pakseresht.calculator.application.dto.CalculatorOperation
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorControllerTest {

    //GIVEN
    private val calculatorController = CalculatorController()

    @Test
    fun it_should_return_welcome_message_given_home(){
        //WHEN
        val returned = calculatorController.home()

        //THEN
        assertEquals("Welcome to calculator api", returned)
    }

    @Test
    fun it_should_return_hello_world_message_given_hello(){
        //WHEN
        val returned = calculatorController.helloWorld()

        //THEN
        assertEquals("Hello, dear voyager", returned)
    }

    @Test
    fun it_should_return_computed_CalculatorOperation_given_post(){
        //GIVEN
        var operation = CalculatorOperation(
                operation = "sum",
                a = 1,
                b = 2
        )

        //WHEN
        val returnedOperation = calculatorController.postCalculatorOperation(operation)

        //THEN
        assertEquals(3, returnedOperation.result)
    }

}