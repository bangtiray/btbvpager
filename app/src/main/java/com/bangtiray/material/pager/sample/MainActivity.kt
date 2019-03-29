package com.bangtiray.material.pager.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangtiray.material.pager.lib.util.init
import com.bangtiray.material.pager.sample.fragment.OneFragment
import com.bangtiray.material.pager.sample.fragment.ThreeFragment
import com.bangtiray.material.pager.sample.fragment.TwoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainToolbar.title = "BTBVPager"

        mainPage.init(mainTabLayout) {
            addPages("One", OneFragment())
            addPages("Two", TwoFragment())
            addPages("Three", ThreeFragment())
        }
    }
}
