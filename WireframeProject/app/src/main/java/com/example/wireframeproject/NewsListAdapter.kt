package com.example.wireframeproject

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wireframeproject.model.Data
import com.example.wireframeproject.model.DataHolders.Companion.STRING_KEY
import com.example.wireframeproject.ui.DetailsActivity
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
        holder.cardView.setOnClickListener {
            var intent = Intent(holder.cardView.context, DetailsActivity::class.java)
            intent.putExtra(STRING_KEY, position)
//            intent.putExtra("data1", data[position].newsTitle)
//            intent.putExtra("data2", data[position].newsBody)
            holder.cardView.context.startActivity(intent)
        }

        holder.newsTitle.text = data[position].newsTitle
        holder.newsBody.text = data[position].newsBody
        holder.newPicture.setImageDrawable(data[position].image)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val newsTitle: TextView = view.title_text
        val newPicture: ImageView = view.image_view
        val newsBody: TextView = view.body_text
        val cardView: CardView = view.card_view
    }
}