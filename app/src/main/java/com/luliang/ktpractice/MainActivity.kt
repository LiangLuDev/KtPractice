package com.luliang.ktpractice

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.luliang.ktpractice.practice1.Practice1_1
import com.luliang.ktpractice.practice2.Practice2_1
import com.luliang.ktpractice.practice3.Practice3_1Object
import com.luliang.ktpractice.practice4.Practice4_1Fun

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val practice1_1 = Practice1_1()
        val practice2_1 = Practice2_1(1)
        val practice4_1Fun = Practice4_1Fun()


        practice1_1.defineVarVal()
        practice1_1.noResult("noResult")
        practice1_1.methodFor()

    }
}
