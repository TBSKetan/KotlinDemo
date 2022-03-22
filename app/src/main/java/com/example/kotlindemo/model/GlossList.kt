package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class GlossList(
    @SerializedName("GlossEntry")
    var glossEntry: GlossEntry?
)