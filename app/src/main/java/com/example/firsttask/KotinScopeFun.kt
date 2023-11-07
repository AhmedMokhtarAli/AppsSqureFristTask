package com.example.firsttask

/**
 * you can use scope functions to simplify and improve the readability of code blocks.
 * There are five main scope functions: let, run, with, apply, and also.
 * Each of these functions has its own use cases and return values.
 *
 *1-let:
 *
 * let is used to execute a block of code on a non-null object and returns the result of the lambda expression.
 * It's often used for performing operations on an object and then returning a result.
 *
 *Example:
 **/


fun useLet() {
    val name: String? = "AppsSqure"
    val result = name?.let {
        "Hello, $it"
    }
    println(result) // Output: Hello, AppsSqure
}

/**
*2-run:

run is used to execute a block of code on an object and returns the result of the lambda expression.
It's similar to let, but it operates on the object itself rather than just a value.
Example:*/
data class Person(var name:String,var age:Int)

private fun useRun() {
    val ahmed = Person("Ahmed", 24)
    val result = ahmed.run {
        "Name: $name, Age: $age" // This is the lambda expression
    }
    println(result) // Output: Name: Alice, Age: 30
}
/**
 * 3-with:
 *
 * with is used to perform operations on an object without the need to reference it explicitly within the lambda expression.
 * It doesn't return a result; it simply operates on the object.
 * Example:*/
fun useWith(){
    val ali = Person("ali", 23)
    with(ali){
        println("Name: $name, Age: $age") // No need to reference 'ali' explicitly
    }
}
/**
 *  4-apply:

apply is used to configure the properties of an object and returns the object itself (the receiver object).
It's often used for initializing properties of an object.*/
fun useApply(){

    val kareem = Person("Kareem",19)
    kareem.apply {
        name = "Kotlin for Beginners"
        age = 20
    }
    println(kareem)
}

fun useAlso(){
    /**
     * 5-also:

    also is used for additional processing on an object and returns the object itself (the receiver object).
    It's similar to apply, but it's used when you want to perform some side effects while keeping the original object.
    Example:*/

    val khaled = Person("khaled", 28)
    khaled.also {
        println("Processing person: $it")
    }.let {
        println("Name: ${it.name}, Age: ${it.age}")
    }
}


fun main(){

    useLet()
    useRun()
    useWith()
    useApply()
    useAlso()

}




