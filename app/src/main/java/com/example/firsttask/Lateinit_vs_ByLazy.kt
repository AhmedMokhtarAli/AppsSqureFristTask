package com.example.firsttask
/**
 *`lateinit` and `by lazy` are both mechanisms in Kotlin to handle the initialization of variables,
 *  but they are used in different contexts and have different characteristics.
  *
1.`lateinit`:
  - `lateinit` is used for properties in classes that are non-nullable and should be initialized before their first use.
  - It is typically used for properties that are initialized later in the code,
  - for example, in the constructor or in a setup method, and you want to avoid nullable types.
  - The property must be of a non-nullable type (no `?` modifier) and cannot be a primitive type (like `Int`, `Double`, etc.).
  - It must be initialized before you access it; otherwise, it will throw an exception.
  - You don't need to use any delegate, and you directly assign a value to it when you are ready.
*/
// Example for lateinit :
lateinit var nameWithLateInit: String

fun iniNameWithLateInit() {
    nameWithLateInit = "AppsSqure"
}
/**
2.`by lazy`:
 - `by lazy` is used to create a property with lazy initialization.
 - The property is initialized the first time it's accessed, and the initialization code is executed only once.
 - It is often used for properties that might not be needed in every execution of the code,
 - and you want to defer their initialization until they are actually used.
 - The property can be of a nullable or non-nullable type, and you provide a lambda block that initializes the property.
 - It's a property delegate provided by Kotlin's standard library.
*/

//Example:
val nameWithLazy: String by lazy {
    println("Initializing name")
    "AppsSqure"
}

fun initNameWithByLazy() {
    println(nameWithLazy) // The property is initialized the first time it's accessed
}

/**In summary, you would use `lateinit` when you have a non-nullable property that you intend to initialize later,
and you're sure it will be initialized before you use it. On the other hand,
you would use `by lazy` when you want to lazily initialize a property, and its initialization might be deferred until the property is actually accessed.*/

private fun main(){
    initNameWithLateinit()
    initNameWithByLazy()
}