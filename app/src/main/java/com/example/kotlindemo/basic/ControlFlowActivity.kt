package com.example.kotlindemo.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlindemo.R

class ControlFlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_flow)

        //if else statement
        val num1 =10
        val num2 =20
        val result = if(num1>num2){
            "$num1 is grater than $num2"
        }else{
            "$num1 is smaller than $num2"
        }
        println(result)
    }
}