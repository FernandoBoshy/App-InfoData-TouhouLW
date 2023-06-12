package com.example.touhouinfo2.Model

import com.example.touhouinfo2.R

var charList = mutableListOf<Characters>()

val CHAR_ID_EXTRA = "CharExtra"

class Characters (
    val charId: Int? = charList.size,
    var imageId: Int = R.drawable.reimu1,
    var name: String = "Reimu Hakurei",
    var world: String = "L1",
    var type: String = "Defense",
    var weakness: Array<String> = arrayOf("Moon", "Metal"),
    var strongness: Array<String> = arrayOf("Water", "Star")
)