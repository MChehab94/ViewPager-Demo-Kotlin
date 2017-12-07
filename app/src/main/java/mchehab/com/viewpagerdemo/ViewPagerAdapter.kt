package mchehab.com.viewpagerdemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by muhammadchehab on 12/7/17.
 */
class ViewPagerAdapter(val fragmentManager: FragmentManager, val listFragments: List<Fragment>,
                       val listTitles: List<String>): FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return listFragments[position]
    }

    override fun getCount(): Int {
        return listFragments.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return listTitles[position]
    }

}