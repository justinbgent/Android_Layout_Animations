package com.example.wireframeproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wireframeproject.R
import com.example.wireframeproject.model.DataHolders.Companion.STRING_KEY
import com.example.wireframeproject.ui.ListActivity.Companion.newsArticles
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var index = intent.getIntExtra(STRING_KEY, 1)
//        newsArticles[index]
        image_details.setImageDrawable(newsArticles[index].image)
        text_title.text = newsArticles[index].newsTitle
        text_body.text = newsArticles[index].newsBody

    }
}
