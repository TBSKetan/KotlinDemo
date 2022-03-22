package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class Glossary(
    @SerializedName("GlossDiv")
    var glossDiv: GlossDiv?,
    @SerializedName("title")
    var title: String?
)