package com.example.android.findme

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class SpotLightImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var paint = Paint()
    private var shouldDrawSpotLight = false
    private var gameOver = false

    private lateinit var winnerRect: RectF
    private var androidBitmapX = 0f
    private var androidBitmapY = 0f

    private val bitmapAndroid = BitmapFactory.decodeResource(
        resources,
        R.drawable.android
    )
    private val spotlight = BitmapFactory.decodeResource(resources, R.drawable.mask)

}
