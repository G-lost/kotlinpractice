package com.glost.kotlinpractice

inline fun printString(str: String, block: (String) -> Unit) {
    println("printString start")
    block(str)
    println("printString end")
}

fun main() {
    println("main start")
    val str = ""
    printString(str) {
        s ->
        println("Lambda start")
        if (s.isEmpty()) return
        println(s)
        println("Lambda end")
    }
    println("main end")
}
