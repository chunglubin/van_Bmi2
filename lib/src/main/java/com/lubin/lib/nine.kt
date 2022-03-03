package com.lubin.lib

fun main(){
    val n = 20
    println((1..n).random())
    for (i in 1..9) {
        for (j in 1..9) {
            var space = ""
            if (i * j < 10)
                space = " "
                println("$i*$j=$space${i * j}")
        }
    }
}