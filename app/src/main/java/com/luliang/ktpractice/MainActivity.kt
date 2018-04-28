package com.luliang.ktpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.luliang.ktpractice.practice1.Practice1_1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val practice1_1 = Practice1_1()


        practice1_1.defineVarVal()
        practice1_1.noResult("noResult")
        practice1_1.methodFor()
    }
}
