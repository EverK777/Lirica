package com.software7.lirica.ui_ux.animations

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Context
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.ActionBar
import android.view.View
import android.view.ViewAnimationUtils
import com.software7.lirica.R

class CircularReveal(var targetObjectAnim: View, var containerView: View, var context: Context) {
    fun openAnim(){

        // get the center for the clipping circle
     //   val w = targetObjectAnim.width
     //   val h = targetObjectAnim.height

        // get the final radius for the clipping circle

        val cx = (targetObjectAnim.width ).toInt()
        val cy = (targetObjectAnim.height).toInt()

        val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()
        // create the animator for this view (the start radius is zero)
        val anim = ViewAnimationUtils.createCircularReveal(targetObjectAnim, cx, cy, 0f, finalRadius)
        anim.addListener(
            object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    super.onAnimationEnd(animation)
                    containerView.setBackgroundColor(context.resources.getColor(R.color.colorPrimaryDark))

                }
            })
        // make the view visible and start the animation
        targetObjectAnim.visibility = View.VISIBLE
        anim.start()
      //  triggerObjectAnim.hide()
    }


    fun closeAnim(){


       // val w = targetObjectAnim.width
      //  val h = targetObjectAnim.height

        // get the final radius for the clipping circle


        val cx = (targetObjectAnim.width ).toInt()
        val cy = (targetObjectAnim.height).toInt()

        val finalRadius = Math.hypot(cx.toDouble(), cy.toDouble()).toFloat()

        val anim = ViewAnimationUtils.createCircularReveal(targetObjectAnim, cx, cy,  finalRadius,0f)
        anim.addListener(object : AnimatorListenerAdapter() {

            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
               targetObjectAnim.visibility = View.GONE
            }
        })
        anim.start()
    }

}