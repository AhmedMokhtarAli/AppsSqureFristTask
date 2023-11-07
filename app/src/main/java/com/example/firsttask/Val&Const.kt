package com.example.firsttask


// const and val are used to assign immutable values


/**
 *const are compile time constants.
 * - Meaning that their value has to be assigned during compile time,
 * consts can never be assigned to a function or any class constructor
 * but only to a String or primitive not object data type
 */
/*
const val sumWithConst = sum(1, 2) //this not ok because we can't assign function to const
data class ClassWithConst(const val constant:Int)  //this not ok because we can't assign const as class constructor

const val objectDataTypeWithConst=ObjectDataType("AppsSqure") // this not ok because const can`t assigned to object data type*/

/**
 *unlike const  val can be done at runtime.
 * - This means, that consts can  be assigned to a function or any class constructor
 *  and to a String , primitive data types or objects data types */

val sumWithVal = sum(1, 2) //this ok because we can assign function to val
data class ClassWithVal( val constant:Int)  //this ok because we can assign val as class constructor

val objectDataTypeWithval=ObjectDataType("AppsSqure") // this ok because val can assigned to object data type

fun sum(x: Int, y: Int) = x + y


data class ObjectDataType(val name:String)