package com.example.wireframeproject.model

import android.graphics.drawable.Drawable

class Data(image: Drawable, newsTitle: String, newsBody: String) {
    val image = image
    val newsTitle = newsTitle
    val newsBody = newsBody
}

class DataHolders{
    companion object{
        const val STRING_KEY = "STRING_DATA_KEY"
        const val INT_KEY = "INT_DATA_KEY"
        const val INT_KEY2 = "INT_DATA_KEY2"
    }
}