package com.srivatsa.scratchcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.anupkumarpanwar.scratchview.ScratchView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sv.setRevealListener(object: ScratchView.IRevealListener {
            override fun onRevealed(scratchView: ScratchView?) {
               Toast.makeText(applicationContext,"Reveled", Toast.LENGTH_SHORT).show()
            }

            override fun onRevealPercentChangedListener(scratchView: ScratchView?, percent: Float) {
                Log.d("scratch", percent.toString())
            }
        })
    }
}
