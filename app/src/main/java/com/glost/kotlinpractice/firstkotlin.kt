package com.glost.kotlinpractice

import kotlin.math.max

fun main()
{
//    println("hello world")

    val fruit = listOf("apple", "watermelon", "banana", "orange", "pear", "grape")
    val maxLengthFruit = fruit.maxBy { it.length }
    
    println( "max length fruit is $maxLengthFruit'" )


}