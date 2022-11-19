package com.example.vizeuygulamasi


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.TypedValue
import android.widget.TextView


class baslangic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic)

        var isim = findViewById<TextView>(R.id.textView)
        var boyut = 10f

        object : CountDownTimer(3000,50){
            override fun onTick(p0: Long) {
                if(boyut != 50f){
                    isim.setTextSize(TypedValue.COMPLEX_UNIT_SP,boyut)
                    boyut = boyut +2f
                }
            }

            override fun onFinish() {

            }

        }.start()

        Handler().postDelayed({
            var gecis1 = Intent(this,ikincisayfa::class.java)
            startActivity(gecis1)
            finish()
        },5000)
    }
}