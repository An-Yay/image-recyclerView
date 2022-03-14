package com.example.recyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.*
import androidx.recyclerview.widget.*


import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemList = mutableListOf(
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://www.denofgeek.com/wp-content/uploads/2016/04/dark-souls_1.jpg?resize=670%2C432"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://avatarfiles.alphacoders.com/158/158644.jpg"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://sportshub.cbsistatic.com/i/2021/10/27/348f28ba-0d19-4b9a-9163-7bff6d9dccc6/jujutsu-kaisen-0-movie-poster.jpg?auto=webp&width=1200&height=628&crop=1.911:1,smart"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum", "https://sportshub.cbsistatic.com/i/2022/03/13/7f4973d0-7242-4a44-95d2-4bbfd699daec/one-piece-kaido-luffy-winner-round-3-manga.jpg?auto=webp&width=1200&height=628&crop=1.911:1,smart"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://pbs.twimg.com/profile_images/1386589068767633409/HuuoOODx_400x400.jpg"),

        )
        val snapHelper = PagerSnapHelper()

        snapHelper.attachToRecyclerView(rView)
        val adapter = Imgadapter(itemList)

        rView.adapter = adapter
        rView.layoutManager = LinearLayoutManager(this)



    }
}