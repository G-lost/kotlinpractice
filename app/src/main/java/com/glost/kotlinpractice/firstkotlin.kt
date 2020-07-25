package com.glost.kotlinpractice

import kotlin.math.max

fun main()
{
//    println("hello world")

    val fruit = listOf("apple", "watermelon", "banana", "orange", "pear", "grape")
    val maxLengthFruit = fruit.maxBy { it.length }
    val newFruit = fruit.filter { it.length<=5 }.map { it.toUpperCase() }
    println( "max length fruit is $maxLengthFruit'" )
    println("result of filter is $newFruit")

}