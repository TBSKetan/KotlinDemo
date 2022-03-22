package com.example.kotlindemo

class Person {
     lateinit var name: String
     fun initializationName(){
         println(this::name.isInitialized)
         name = "Ketan"
         println(this::name.isInitialized)
     }
}

