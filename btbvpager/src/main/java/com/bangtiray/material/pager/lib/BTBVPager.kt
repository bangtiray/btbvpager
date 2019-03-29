package com.bangtiray.material.pager.lib

import android.content.Context
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.bangtiray.material.pager.lib.adapter.BTBVPagerAdapter
import com.bangtiray.material.pager.lib.model.NonImage
import com.google.android.material.tabs.TabLayout

class BTBVPager : ViewPager {
    private var pages: MutableList<NonImage> = ArrayList()
    private var manager: FragmentManager? = null
    private var tab: TabLayout? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    fun initFragmentManager(manager: FragmentManager) {
        this.manager = manager
    }

    fun addTabLayout(tab: TabLayout) {
        this.tab = tab
    }

    fun addPages(Title: String, Page: Fragment) {
        pages.add(NonImage(Page, Title))
    }

    fun build() {
        manager?.let {
            tab?.setupWithViewPager(this)

            val adapter = BTBVPagerAdapter(it)
            adapter.setPages(pages)
            setAdapter(adapter)

        } ?: throw RuntimeException("Add initFragmentManager() before you call build()")
    }
}