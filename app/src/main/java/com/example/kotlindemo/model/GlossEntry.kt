package com.example.kotlindemo.model


import com.google.gson.annotations.SerializedName

data class GlossEntry(
    @SerializedName("Abbrev")
    var abbrev: String?,
    @SerializedName("Acronym")
    var acronym: String?,
    @SerializedName("GlossDef")
    var glossDef: GlossDef?,
    @SerializedName("GlossSee")
    var glossSee: String?,
    @SerializedName("GlossTerm")
    var glossTerm: String?,
    @SerializedName("ID")
    var iD: String?,
    @SerializedName("SortAs")
    var sortAs: String?
)