package com.software7.lirica.data.internal

import android.content.Context
import com.software7.lirica.R
import io.reactivex.Observable
import java.util.*
import kotlin.collections.ArrayList


class BackgroundsResources(var context: Context) {

    private val backgroundImages : Array<Pair<Int,Array<String>>> = arrayOf(
        Pair(R.drawable.lion, arrayOf("peace","hope","happiness","feel","care","happy","great")),
        Pair(R.drawable.fern, arrayOf("pain","hope","sadness","sad","heartbreak","miss","leave")),
        Pair(R.drawable.hands, arrayOf("love","couple","kiss","hearth","wife","marry","wife")),
        Pair(R.drawable.happy, arrayOf("love","couple","kiss","hearth","wife","marry","wife")),
        Pair(R.drawable.henne, arrayOf("vain","moment","kiss","love","moments","sea","ocean")),
        Pair(R.drawable.love, arrayOf("love","couple","kiss","hearth","wife","marry","wife")),
        Pair(R.drawable.milkway, arrayOf("think","vain","travel","between","yesterday")),
        Pair(R.drawable.happy, arrayOf("love","couple","kiss","hearth","wife","marry","wife")),
        Pair(R.drawable.road1, arrayOf("peace","hope","happiness","feel","care","happy","great")),
        Pair(R.drawable.road2, arrayOf("love","couple","kiss","hearth","wife","marry","wife")),
        Pair(R.drawable.sad, arrayOf("pain","hope","sadness","sad","heartbreak","miss you","leave")),
        Pair(R.drawable.sorrow, arrayOf("pain","hope","sadness","sad","heartbreak","miss you","leave")),
        Pair(R.drawable.sunset, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")),
        Pair(R.drawable.van, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")),
        Pair(R.drawable.woman, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")),
        Pair(R.drawable.sparkler, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")),
        Pair(R.drawable.hands2, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")),
        Pair(R.drawable.beach, arrayOf("sun","sunset","happy","love","couple","peace","leave","beuatifull")))

    private val colorBgs: IntArray = intArrayOf(R.color.bg1,R.color.bg2,R.color.bg3,R.color.bg4,R.color.bg5,R.color.bg6,R.color.bg7
        ,R.color.bg8,R.color.bg9,R.color.bg10,R.color.bg11
        ,R.color.bg12,R.color.bg13,R.color.bg14,R.color.bg15
        ,R.color.bg16)

    private val gradientBgs : IntArray = intArrayOf(R.drawable.gradient1,
        R.drawable.gradient2,R.drawable.gradient3,R.drawable.gradient4)


    fun getBackgroundImg():Int{

        fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) + start
        val randomNumber = (0..(backgroundImages.size-1)).random()

        return backgroundImages[randomNumber].first
    }


    fun getBackgroundColorGradient():Int{
        fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) + start
        val randomNumber = (0..(gradientBgs.size-1)).random()

        return gradientBgs[randomNumber]
    }



    fun getColorBackground():Int{
        fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) + start
        val randomNumber = (0..(colorBgs.size-1)).random()

        return colorBgs[randomNumber]
    }


}