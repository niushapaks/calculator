package eu.pakseresht.calculator.domain

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun it_should_add_given_sum_operator(){
        //GIVEN
        val operator = "sum"

        //WHEN
        val returnedValue = calculator.compute(operator, 2, 3)

        //THEN
        assertEquals(5, returnedValue)
    }

    @Test
    fun it_should_subtract_given_subtract_operator(){
        //GIVEN
        val operator = "subtract"

        //WHEN
        val returnedValue = calculator.compute(operator, 3, 2)

        //THEN
        assertEquals(1, returnedValue)
    }

}