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
import com.example.recyclerviewapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

import java.lang.Exception
import java.net.UnknownHostException


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var currentPage: Int = 1
    var loading: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var itemList = mutableListOf(
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://www.denofgeek.com/wp-content/uploads/2016/04/dark-souls_1.jpg?resize=670%2C432"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://avatarfiles.alphacoders.com/158/158644.jpg"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://sportshub.cbsistatic.com/i/2021/10/27/348f28ba-0d19-4b9a-9163-7bff6d9dccc6/jujutsu-kaisen-0-movie-poster.jpg?auto=webp&width=1200&height=628&crop=1.911:1,smart"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum", "https://sportshub.cbsistatic.com/i/2022/03/13/7f4973d0-7242-4a44-95d2-4bbfd699daec/one-piece-kaido-luffy-winner-round-3-manga.jpg?auto=webp&width=1200&height=628&crop=1.911:1,smart"),
            laytext("lorem ipsum", "lorem ipsum", "lorem ipsum","https://pbs.twimg.com/profile_images/1386589068767633409/HuuoOODx_400x400.jpg"),

        )
        val snapHelper = PagerSnapHelper()

        snapHelper.attachToRecyclerView(binding.rView)
        val adapter = Imgadapter(itemList)
        binding.rView.adapter = adapter

        var layoutManager = LinearLayoutManager(this)
        binding.rView.layoutManager = layoutManager

        binding.rView.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val indexRv = (binding.rView.layoutManager as? LinearLayoutManager)?.findFirstVisibleItemPosition()
                if(indexRv!=0){
                    binding.scrollToTopBtn.visibility = View.VISIBLE
                } else {
                    binding.scrollToTopBtn.visibility = View.GONE
                }
            }
        })

        binding.scrollToTopBtn.setOnClickListener{
            binding.rView.smoothScrollToPosition(0)
            binding.rView.smoothScrollBy(5,0)
        }
    }













}
// view binding