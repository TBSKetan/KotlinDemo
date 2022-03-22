package com.example.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindemo.basic.ControlFlowActivity
import com.example.kotlindemo.oop.OperatorOverloadingActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val TAG = "MainActivity"
    private lateinit var btnControlFlow: Button
    private lateinit var btnOOP: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Screen on off
        startService(Intent(applicationContext, LockService::class.java))

        //What’s the difference between val and var declaration? How to convert a String to an Int?
        val s: String = "Hello Kotlin"
        var x = 5
        x = "6".toInt()
        Log.d("Int Value", "-->$x String Value --> $s")

        //Null Safety and Nullable Types in Kotlin? What is the Elvis Operator?
        var str: String? = "Hello Ketan"
        var newStr = str ?: "Default Value"
        Log.d("newStr 1 Value", "-->$newStr")

        str = null
        newStr = str ?: "Default Value"
        Log.d("newStr 2 Value", "-->$newStr")

        var strName: String? = "Hello Ketan"
        strName.let { println(strName) }
        str = null
        strName.let { println(str) }

        // string interpolation
        val name = "Journaldev.com"
        val desc = "$name now has Kotlin Interview Questions too. ${name.length}"
        println(desc)

        //What are data classes in Kotlin?
        data class Book(var name: String, var authorName: String, var price: Int)

        val book = Book("Kotlin Tutorials", "Anupam", 25)
        println(book.component1())
        println(book.component2())
        println(book.component3())

        //What are destructuring declarations in Kotlin? Explain it with an example.
        data class Book1(var name: String, var authorName: String, var price: Int)

        val book1 = Book1("Test ", "Ketan Nakum", 250)
        var (n, a, p) = book1
        println(n)
        println(a)
        println(p)

        inlineFunction({ println("Inlined functions") },
            {
                println("Instead of object creation it copies the code.")
            })

        //What is the difference between safe calls(?.) and null check(!!)?
        var name0: String? = "MindOrks"
        println(name.length) // 8
        name0 = null
        println(name.length) // null

        var name1: String? = "MindOrks"
        println(name1?.length) // 8
        name1 = null
        println(name!!.length) // KotlinNullPointerException

        var listOfMindOrks = listOf("mindorks.com", "blog.mindorks.com", "afteracademy.com")
        listOfMindOrks.forEach {
            Log.d(TAG, it)
        }

        btnControlFlow = findViewById(R.id.btnControlFlow)
        btnOOP = findViewById(R.id.btnOOP)
        btnControlFlow.setOnClickListener(this)
        btnOOP.setOnClickListener(this)
//        btnControlFlow.setOnClickListener{
//            val intent =  Intent(this, ControlFlowActivity::class.java)
//            startActivity(intent)
//        }

    }

    class Person {
        lateinit var name: String
        fun initializationName() {
            println(this::name.isInitialized)
            name = "Ketan"
            println(this::name.isInitialized)
        }
    }


    inline fun inlineFunction(myFunction: () -> Unit, another: () -> Unit) {
        myFunction()
        another()
        print("It's awesome")

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_POWER) {
            // Do something here...
            event.startTracking() // Needed to track long presses
            Log.d(TAG, "onKeyDown() called with: keyCode = $keyCode, event = $event")
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        return if (keyCode == KeyEvent.KEYCODE_POWER) {
            // Do something here...
            Log.d(TAG, "onKeyLongPress() called with: keyCode = $keyCode, event = $event")
            true
        } else super.onKeyLongPress(keyCode, event)
    }

    override fun onClick(view: View?) {
       //TODO("Not yet implemented")
        when (view?.id) {
            R.id.btnControlFlow -> {
                val intent = Intent(this, ControlFlowActivity::class.java)
                startActivity(intent)
            }
            R.id.btnOOP -> {
                val intent = Intent(this, OperatorOverloadingActivity::class.java)
                startActivity(intent)
            }
            else ->{

            }
        }

    }
}