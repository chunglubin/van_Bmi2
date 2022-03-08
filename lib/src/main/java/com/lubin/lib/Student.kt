package com.lubin.lib

open class Student(var name: String, var english: Int, var math: Int) {
    companion object{//特殊物件
        var pass=60//特殊屬性
        fun test(){

        }
    }
    constructor() : this("", 0, 0) {
        println("Hi")
    }
    constructor(name: String) : this(name, 0, 0) {
    }
    //Fields
    //var name: String? = null
    //var english = 0
    //var math = 0
    //Methods
    //val pass=60
    fun print() {
        print("$name\t$english\t$math\t${average()}")
        if(average()<pass)println("*")else println()
    }
    fun average() : Int {
        return (english+math)/2
    }
    //上方類別簡化後可為fun average()=(english+math)/2
    fun max(a:Int,b:Int):Int{
        return if(a>b)a else b
    }
    //上方類別簡化後可為fun max(a:Int,b:Int)=if(a>b)a else b
    //下方寫出a method named "highest" can return one highest score of all courses
    fun highest()=if(english>math)english else math
    fun grading():Char{
        //var grade='A'
        var grade=when(average()/10){//當平均除１０
            9,10->'A'//＝>in 9..10值在９到１０可給它Ａ
            8->'B'
            7->'C'
            6->'D'
            else->'F'
        }
        return grade
    }
    /*上方可簡化成
                    fun grading()=when(average()/10){
                            9,10->'A'
                            8->'B'
                            7->'C'
                            6->'D'
                            else->'F'
                    }
    */
}

fun main() {
    val hank = Student("Hank",60,40)
    val jack = Student("Jack", 85, 65)
    //jack.
    //jack.english = 85
    //jack.math = 65
    //println("${jack.name}\t${jack.english}\t${jack.math}")
    Student.pass=50
    jack.print()
    hank.print()
}