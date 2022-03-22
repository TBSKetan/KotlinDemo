package com.example.kotlindemo.oop

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.graphics.plus
import com.example.kotlindemo.R


class OperatorOverloadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operator_overloading)

        //operator-overloading
        val a = 5
        val b = 10
        println(a.plus(b))
        Log.d("OperatorActivity", "onCreate: ${a.plus(b)}")

        //Overloading + Operator
        val p1  = Point(3, -8)
        val p2  = Point(2, 10)

        var sum = Point()
        sum =  p1 + p2
        println("Sum = (${sum.x}, ${sum.y})")
    }

    class Point(val x:Int =0, val y:Int =10)
    {
        // overloading plus function
        operator  fun plus(p: Point) : Point{
            return Point(x + p.x, y +p.y)
        }
    }
}