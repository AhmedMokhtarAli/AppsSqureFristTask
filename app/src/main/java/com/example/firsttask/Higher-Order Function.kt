package com.example.firsttask

/**
 * Higher-order functions
 *
 * functions that can take other functions as parameters or return functions as results.
 * Higher-order functions provide a powerful way to work with functions and create more flexible and reusable code.
 *
 * Declaring a Higher-Order Function:
 * To declare a higher-order function, you specify a function type as a parameter or return type.
 * Function types are denoted by (parameters) -> returnType.
 *
 * For example:*/

fun higherOrderFunction(action: () -> Unit) {
    action()
}

/**
*Function Types with Parameters:
You can define higher-order functions that take functions with parameters. For example:*/
fun higherOrderFunctionWithParams(action: (Int, Int) -> Int) {
    val result = action(5, 3)
    println("Result: $result")
}
/***
 * Function Types as Return Values:
 * Higher-order functions can also return function types.
 * This allows you to create functions on the fly and return them from other functions.
 * For example:*/
fun createMultiplier(factor: Int): (Int) -> Int {
    return { number -> number * factor }
}



fun main() {
    higherOrderFunction {
        println("higherOrderFunWithLambdaExprassion")
    }

    higherOrderFunctionWithParams { a, b -> a + b }

    val timesTwo = createMultiplier(2)
    val timesThree = createMultiplier(3)

    println(timesTwo(4))    // Output: 8
    println(timesThree(4))  // Output: 12
}
