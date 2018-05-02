package com.luliang.ktpractice.practice2

/**
 * Created by LuLiang on 2018/5/2.
 * @author LuLiang
 * @github https://github.com/LiangLuDev
 * 类继承（父类使用open关键字才可被继承 方法重写同理）
 */

open class Practice2_5Extends{

    /**
     * 方法重写需使用open关键字
     */
    open fun extentOverride(){
    }
}


class Extends: Practice2_5Extends() {

    /**
     * 重写父类方法使用override关键字
     */
    override fun extentOverride() {
        super.extentOverride()

    }
}