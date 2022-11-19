package com.example.vizeuygulamasi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class ikincisayfa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikincisayfa)
        var tus1 = findViewById<TextView>(R.id.textView1)
        var tus2 = findViewById<TextView>(R.id.textView2)
        var tus3 = findViewById<TextView>(R.id.textView3)
        var tus4 = findViewById<TextView>(R.id.textView4)
        var pb1 = findViewById<ProgressBar>(R.id.progressBar)
        var ib1 = findViewById<ImageView>(R.id.imageView4)
        var ib2 = findViewById<ImageView>(R.id.imageView5)
        var ib3 = findViewById<ImageView>(R.id.imageView6)
        var ib4 = findViewById<ImageView>(R.id.imageView7)
        ib1.visibility=View.INVISIBLE
        ib2.visibility=View.INVISIBLE
        ib3.visibility=View.INVISIBLE
        ib4.visibility=View.INVISIBLE
        pb1.visibility=View.INVISIBLE

        var i = 0

        if (i == 0) {
            tus1.setOnClickListener {
                ib1.visibility = View.VISIBLE

                tus2.setOnClickListener {
                    ib2.visibility = View.VISIBLE

                    tus3.setOnClickListener {
                        ib3.visibility = View.VISIBLE

                        tus4.setOnClickListener {
                            ib4.visibility = View.VISIBLE
                            pb1.visibility=View.VISIBLE
                            Handler().postDelayed({
                                var gecis2= Intent(this,MainActivity::class.java)
                                startActivity(gecis2)
                                finish()
                            },5000)

                        }
                    }
                }
            }
        }
    }
}