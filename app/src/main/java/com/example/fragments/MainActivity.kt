package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = Bundle()
        bundle.putString("Key", "Tejas")
        val fragment = FirstFragment()
        fragment.arguments = bundle

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter.apply {
            add(FirstFragment())
            add(BlankFragment())
        }

        viewPager.adapter = viewPagerAdapter
        viewPager.setPageTransformer(true, ZoomOutPageTransformer())


//        supportFragmentManager.beginTransaction().replace(R.id.container, FirstFragment()).commitNow()
    }
}