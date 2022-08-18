package com.roy.hobby_yun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupEvents()
        setupValues()
    }

    override fun setupEvents() {

    }

    override fun setupValues() {
//        뷰페이저 작업 -> 탭레이아웃과 연결


//        mainTabLayout.setupWithViewPager()

    }

}