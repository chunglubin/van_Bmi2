package com.lubin.lib

class Student{
    var name:String?=null
    var english=0
    var math=0
    fun print(){
        println("$name\t$english\t$math\t${average()}")
    }
    fun average():Int {
        return (english+math)/2
    }
}
fun main(){
    val jack=Student()
    jack.name="jack"
    jack.english=70
    jack.math=80
    jack.print()
    //jack.average()
}