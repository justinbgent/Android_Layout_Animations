package com.example.wireframeproject.model

import com.example.wireframeproject.R
import com.example.wireframeproject.ui.ListActivity.Companion.newsString
import java.io.Serializable

class Data(imageID: Int, newsTitle: String, newsBody: String): Serializable {
    val imageID = imageID
    val newsTitle = newsTitle
    val newsBody = newsBody
}

object DataHolders{
    var newsArticles = mutableListOf<Data>(
    Data(R.drawable.abstract_abstract_expressionism_art_2505693, "Flowers Gone Crazy", newsString),
    Data(R.drawable.close_up_colorful_colors_2529148, "Flowers Gone Crazy", newsString),
    Data(R.drawable.aerial_photography_aerial_shot_aerial_view_2583847, "Flowers Gone Crazy", newsString),
    Data(R.drawable.adventure_automobile_classic_2533092, "Flowers Gone Crazy", newsString),
    Data(R.drawable.afterglow_beach_cliff_2555285, "Flowers Gone Crazy", newsString),
    Data(R.drawable.alley_architecture_buildings_2526517, "Flowers Gone Crazy", newsString),
    Data(R.drawable.architectural_design_architecture_bridge_2540653, "Flowers Gone Crazy", newsString),
    Data(R.drawable.beautiful_breathtaking_canada_day_2526105, "Flowers Gone Crazy", newsString),
    Data(R.drawable.bloom_blossom_flora_2567011, "Flowers Gone Crazy", newsString),
    Data(R.drawable.clouds_coconut_trees_daylight_2486168, "Flowers Gone Crazy", newsString),
    Data(R.drawable.colorful_colourful_houses_2501965, "Flowers Gone Crazy", newsString),
    Data(R.drawable.wallpaper_astronomy_astrophotography_2538107, "Flowers Gone Crazy", newsString),
    Data(R.drawable.abstract_abstract_expressionism_art_2505693, "Flowers Gone Crazy", newsString),
    Data(R.drawable.aerial_photography_aerial_shot_aerial_view_2583847, "Flowers Gone Crazy", newsString),
    Data(R.drawable.adventure_automobile_classic_2533092, "Flowers Gone Crazy", newsString),
    Data(R.drawable.afterglow_beach_cliff_2555285, "Flowers Gone Crazy", newsString),
    Data(R.drawable.alley_architecture_buildings_2526517, "Flowers Gone Crazy", newsString),
    Data(R.drawable.architectural_design_architecture_bridge_2540653, "Flowers Gone Crazy", newsString),
    Data(R.drawable.beautiful_breathtaking_canada_day_2526105, "Flowers Gone Crazy", newsString),
    Data(R.drawable.bloom_blossom_flora_2567011, "Flowers Gone Crazy", newsString),
    Data(R.drawable.close_up_colorful_colors_2529148, "Flowers Gone Crazy", newsString),
    Data(R.drawable.clouds_coconut_trees_daylight_2486168, "Flowers Gone Crazy", newsString),
    Data(R.drawable.colorful_colourful_houses_2501965, "Flowers Gone Crazy", newsString),
    Data(R.drawable.wallpaper_astronomy_astrophotography_2538107, "Flowers Gone Crazy", newsString)
    )
}