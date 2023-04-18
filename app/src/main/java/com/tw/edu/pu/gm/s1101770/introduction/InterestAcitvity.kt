package com.tw.edu.pu.gm.s1101770.introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.GestureDetector
import android.view.GestureDetector.OnGestureListener
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class InterestAcitvity : AppCompatActivity(), OnGestureListener{

    lateinit var textView: TextView
    lateinit var gDetector: GestureDetector
    var count:Int = 0
    var hobby = arrayOf("繪畫", "遊戲", "攝影", "影集")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interest_acitvity)
        gDetector = GestureDetector(this, this)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        gDetector.onTouchEvent(event)
        return true
    }

    override fun onDown(e: MotionEvent): Boolean {
        return true
    }

    override fun onShowPress(e: MotionEvent) {
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        return true
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        return true
    }

    override fun onLongPress(e: MotionEvent) {
    }


    override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
        if (e1.x <= e2.x){
            count++
            if(count>3){count=0}
            Log.d("count", count.toString())
        }
        else{
            count--
            if(count<0){count=3}
            Log.d("count", count.toString())
        }
        var res:Int = getResources().getIdentifier("hobby" + count.toString(),
            "drawable", getPackageName())
        findViewById<ImageView>(R.id.imageView).setImageResource(res)
        findViewById<TextView>(R.id.textView).setText(hobby[count])
        return true
    }


}