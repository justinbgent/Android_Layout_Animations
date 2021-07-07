package com.example.wireframeproject

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.wireframeproject.model.Data
import com.example.wireframeproject.ui.DetailsActivity
import com.example.wireframeproject.ui.DetailsActivity.Companion.DATA_KEY
import com.example.wireframeproject.ui.DetailsActivity.Companion.STRING_KEY
import kotlinx.android.synthetic.main.news_item.view.*

class NewsListAdapter(private val data: MutableList<Data>) : RecyclerView.Adapter<NewsListAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataSpot = data[position]

        holder.newsTitle.text = data[position].newsTitle
        holder.newsBody.text = data[position].newsBody
        holder.newPicture.setImageDrawable(ContextCompat.getDrawable(holder.newPicture.context, data[position].imageID))

        holder.cardView.setOnClickListener {view ->
            var intent = Intent(view.context, DetailsActivity::class.java)
            intent.putExtra(STRING_KEY, position)
            intent.putExtra(DATA_KEY, dataSpot)

            val optionsBundle: Bundle = ActivityOptions.makeSceneTransitionAnimation(view.context as Activity, holder.newPicture, "shared_image").toBundle()

            view.context.startActivity(intent, optionsBundle)
        }

        setStartAnimation(holder.cardView)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val newsTitle: TextView = view.title_text
        val newPicture: ImageView = view.image_view
        val newsBody: TextView = view.body_text
        val cardView: CardView = view.card_view
    }

    private fun setStartAnimation(viewToAnimate: View){
        val animation: Animation = AnimationUtils.loadAnimation(viewToAnimate.context, R.anim.abc_fade_in)
        viewToAnimate.startAnimation(animation)
    }
}