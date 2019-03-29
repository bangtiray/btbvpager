package com.bangtiray.material.pager.lib.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bangtiray.material.pager.lib.model.NonImage

internal class BTBVPagerAdapter(f: FragmentManager) : FragmentPagerAdapter(f) {

    private var pages: MutableList<NonImage> = mutableListOf()

    override fun getItem(position: Int): Fragment {
        return pages[position].page
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return pages[position].title
    }

    fun setPages(pages: MutableList<NonImage>) {
        this.pages = pages
    }

    override fun getCount(): Int {
        return pages.size
    }


}