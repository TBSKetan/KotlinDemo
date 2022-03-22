package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class Test(
    @SerializedName("glossary")
    var glossary: Glossary?
)