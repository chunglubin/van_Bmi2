package com.lubin.bmi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.lubin.bmi2.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG=MainActivity::class.java.simpleName
    }//window+shift +向上鍵做移動
    //val TAG =MainActivity::class.java.simpleName//得到guess simple name
    private lateinit var binding:ActivityMainBinding//定義父類別
    override fun onCreate(savedInstanceState: Bundle?) {//覆寫上一個類別
                                                        // override防呆機制
        super.onCreate(savedInstanceState)//super:覆寫父類別上的必要設定
        binding= ActivityMainBinding.inflate(layoutInflater)//用layoutInflater自動呼叫getlayoutInflater
        setContentView(binding.root)
        binding.
    }
    fun button(view: View){
        Log.d(TAG, "Testing: ")//logd按Tab
        val guess= Random.nextInt(10)+1
        println(guess)
        var num=binding.edNumber.text.toString().toInt();
        while(num!=guess){
            //println("Please enter a number(1-10):")
            //num = readLine()!!.toInt()
            //num = binding.edNumber.text.length
            if(num>guess)Log.d("Smaller",num.toString())
            else if(num<guess)Log.d("Bigger",num.toString())
            else println("You got it!The secret number is ${guess}")
            //var weight = binding.edWeight.text.toString().toFloat()
        }
        Log.d("Guess Number",num.toString())
    }
}