package com.ovrbach.motionlayoutcollapsing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            progress_bar.visibility = View.GONE
            error.text = "Stay hidden"
            error.visibility = View.GONE
        }, 1000)
    }
}
