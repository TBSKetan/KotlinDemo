package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class GlossDef(
    @SerializedName("GlossSeeAlso")
    var glossSeeAlso: List<String>?,
    @SerializedName("para")
    var para: String?
)