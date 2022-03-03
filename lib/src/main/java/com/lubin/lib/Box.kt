package com.lubin.lib

class Box1{
    var length=0
    var width=0
    var height=0
    fun money1(){
        println("This box1 amount is 50 dolloars.")
    }
}
class Box2{
    var length=0
    var width=0
    var height=0
    fun money2(){
        println("This box2 amount is 60 dolloars.")
    }
}
class Box3{
    var length=0
    var width=0
    var height=0
    fun money3(){
        println("This box3 amount is 70 dolloars.")
    }
}
fun main(){
    val box1=Box1()
    box1.length=10
    box1.width=10
    box1.height=10
    val box2=Box2()
    box2.length=10
    box2.width=10
    box2.height=15
    val box3=Box3()
    box3.length=10
    box3.width=15
    box3.height=15
    box1.money1()
    box2.money2()
    box3.money3()
}