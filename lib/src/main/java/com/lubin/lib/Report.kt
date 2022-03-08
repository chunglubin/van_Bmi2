package com.lubin.lib

import com.lubin.lib.FinanceReport as

interface Report {
    fun print()
}


class FinanceReport:Report {
    override fun print() {
        println("Finance!")
    }
}

fun main(){
    val financeReport = FinanceReport()
    financeReport.print()
    //anonymous class
    object : Report {
        override fun print() {
            println("Health!")
        }
    }.print()
}