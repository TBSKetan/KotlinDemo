package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class GlossDiv(
    @SerializedName("GlossList")
    var glossList: GlossList?,
    @SerializedName("title")
    var title: String?
)