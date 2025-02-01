package com.example.sampleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.sampleapp.Adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var Myadapter:ViewPagerAdapter
    lateinit var viewpager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        Myadapter = ViewPagerAdapter(this)
        viewpager=findViewById(R.id.viewpager)
        viewpager.orientation=ViewPager2.ORIENTATION_VERTICAL
        viewpager.adapter=Myadapter
    }
}