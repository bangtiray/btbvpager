package com.bangtiray.material.pager.lib.util

import androidx.appcompat.app.AppCompatActivity
import com.bangtiray.material.pager.lib.BTBVPager
import com.google.android.material.tabs.TabLayout

inline fun BTBVPager.init(tabLayout: TabLayout? = null, addPage: BTBVPager.() -> Unit) {
    initFragmentManager((context as AppCompatActivity).supportFragmentManager)
    tabLayout?.setupWithViewPager(this)
    addPage()
    build()
}