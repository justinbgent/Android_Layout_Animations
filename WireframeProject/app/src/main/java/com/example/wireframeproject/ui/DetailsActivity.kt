package com.example.wireframeproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.Window
import androidx.core.content.ContextCompat
import com.example.wireframeproject.R
import com.example.wireframeproject.model.Data
import com.example.wireframeproject.model.DataHolders.newsArticles
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    companion object{
        const val STRING_KEY = "STRING_DATA_KEY"
        const val DATA_KEY = "CLASS_DATA_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Explode()
        window.exitTransition = Explode()

        setContentView(R.layout.activity_details)

        val index = intent.getIntExtra(STRING_KEY, 1)
        val item = intent.getSerializableExtra(DATA_KEY) as Data

        image_details.setImageDrawable(ContextCompat.getDrawable(this, item.imageID))
        text_title.text = newsArticles[index].newsTitle
        text_body.text = newsArticles[index].newsBody
    }
}
