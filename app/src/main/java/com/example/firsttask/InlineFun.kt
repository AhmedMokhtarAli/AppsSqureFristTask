package com.example.firsttask

/**
 * Inline Fun
 *
 *  the inline keyword is used to declare an inline function.
 *  Inline functions are a powerful feature that can improve the performance of your code by eliminating the overhead of function calls.
 *  When you mark a function as inline, the compiler replaces the function call with the actual code of
 *  the function at the call site.
 *  This can eliminate the runtime overhead associated with function calls,
 *  such as parameter passing and stack frame creation.
 *
 * Example
 * */

inline fun squreOfNum(number:Int) = number * number
 fun main(){
     val squreOf2= squreOfNum(2) //the
 }