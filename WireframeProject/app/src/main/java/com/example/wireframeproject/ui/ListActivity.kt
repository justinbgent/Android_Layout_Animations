package com.example.wireframeproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wireframeproject.NewsListAdapter
import com.example.wireframeproject.R
import com.example.wireframeproject.model.DataHolders.newsArticles
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    companion object{
        val newsString = "Lorem is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley ipsum dolor sit amet, consectetur adipiscing elit. Sed blandit felis vitae aliquet euismod. Nulla quis viverra felis. Nulla dictum augue eget nunc sollicitudin sollicitudin. Donec pulvinar elit a justo facilisis, sit amet rhoncus ex pulvinar. Sed malesuada elementum nisi, vel fermentum nisl lacinia in. Quisque porta mollis pellentesque. Etiam mattis eros vel orci ultricies aliquet. In vitae nisi nec quam venenatis aliquet. Curabitur quis tincidunt massa. Duis iaculis justo et nibh mattis blandit ut eu mi. Nullam eu turpis quam. Suspendisse feugiat, neque vitae tincidunt facilisis, enim leo ornare elit, sit amet tempor neque magna in lacus.\n Pellentesque dapibus risus vitae risus pulvinar vulputate. Phasellus nisl lacus, elementum non risus quis, hendrerit pellentesque ligula. Fusce finibus ultrices ligula et semper. Ut faucibus, arcu vel varius consequat, tortor massa elementum ante, at hendrerit magna sem aliquam augue. Nullam non nisl bibendum, sollicitudin dolor eu, eleifend erat. Nullam non auctor felis. Sed congue ex id tellus venenatis, eget ultrices mauris dictum. Quisque vel mi nibh. Nulla venenatis tincidunt pulvinar. Praesent mattis suscipit consectetur. In rhoncus ac quam imperdiet rutrum. Nulla lacinia, purus sed mattis maximus, tortor leo feugiat quam, in gravida arcu mi sed tellus. Vestibulum at ex tincidunt, ultricies sem id, dapibus augue. Aliquam vel bibendum magna. Curabitur ut eros diam. Curabitur molestie quam ante, varius lacinia velit mollis vel."
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        news_articles.setHasFixedSize(true)
        val manager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
//        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = NewsListAdapter(newsArticles)
        news_articles.layoutManager = manager
        news_articles.adapter = adapter
    }
}
