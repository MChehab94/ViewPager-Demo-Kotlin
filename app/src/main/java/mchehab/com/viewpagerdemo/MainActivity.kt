package mchehab.com.viewpagerdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listFragments = mutableListOf<Fragment>()
    val listTitles = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listFragments.add(FirstFragment())
        listFragments.add(SecondFragment())
        listFragments.add(ThirdFragment())

        listTitles.add("First Page")
        listTitles.add("Second Page")
        listTitles.add("Third Page")

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, listFragments, listTitles)
        viewPager.adapter = viewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}