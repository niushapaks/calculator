package eu.pakseresht.calculator.domain

class Calculator {

    private val sum = {a: Int, b: Int -> a + b}
    private val subtract = {a: Int, b: Int -> a - b}

    fun compute(operator: String, a: Int, b: Int): Int {

        return when(operator){
            "sum" -> sum(a, b)
            "subtract" -> subtract(a, b)
            else -> TODO("no implemented")
        }

    }

}
