package com.luliang.ktpractice.practice2

import android.util.Log

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 *
 * 类声明直接(生成构造函数)
 *
 */

class Practice2_1(str: String) {

    /**
     *初始化的代码可以放到以 init 关键字作为前缀的代码块
     */
    init {
        Log.d("Practice2_1.init",str)
    }

    /**
     * 可以有多个init代码初始块，按照排列顺序执行
     */
    init {

    }


    /**
     * Int=1 函数参数设置默认值
     */
    constructor(int:Int=1) : this("Practice2_1") {
        Log.d("Practice2_1.init", int.toString())
    }
}