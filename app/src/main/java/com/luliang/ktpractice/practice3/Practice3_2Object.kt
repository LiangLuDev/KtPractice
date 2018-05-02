package com.luliang.ktpractice.practice3

import android.util.Log

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 * 伴生对象  类似java静态类成员（单例）  使用companion关键字
 */
class Practice3_2Object {

    companion object {
        var instance = Practice3_2Object()
    }

    fun print() {


    }
}
//调用
//Practice3_2Object.instance.print()