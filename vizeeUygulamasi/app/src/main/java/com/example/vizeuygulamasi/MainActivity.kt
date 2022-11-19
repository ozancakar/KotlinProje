package com.example.vizeuygulamasi


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Gravity

import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        var button =findViewById<Button>(R.id.button1)
        var ch = findViewById<CheckBox>(R.id.checkBox)
        var radioGrup = findViewById<RadioGroup>(R.id.rG)
        var rb1 = findViewById<RadioButton>(R.id.radioButton)
        var rb2 = findViewById<RadioButton>(R.id.radioButton2)
        var rb3 = findViewById<RadioButton>(R.id.radioButton3)
        var rb4 = findViewById<RadioButton>(R.id.radioButton4)
        var rb5 = findViewById<RadioButton>(R.id.radioButton5)
        var rb6 = findViewById<RadioButton>(R.id.radioButton6)
        var rb7 = findViewById<RadioButton>(R.id.radioButton7)
        var rb8 = findViewById<RadioButton>(R.id.radioButton8)
        var rb9 = findViewById<RadioButton>(R.id.radioButton9)
        var rb10 = findViewById<RadioButton>(R.id.radioButton10)
        var rb11 = findViewById<RadioButton>(R.id.radioButton11)
        var rb12 = findViewById<RadioButton>(R.id.radioButton12)



        radioGrup.visibility=View.INVISIBLE
        button.visibility=View.INVISIBLE


        ch.setOnClickListener {
            radioGrup.visibility = View.VISIBLE
            button.visibility = View.VISIBLE
            var x = 0

            radioGrup.setOnCheckedChangeListener { radioGroup, i ->
                x++
                if (R.id.radioButton == i) {

                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)
                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Ezogelin"
                        toastyazi.text = "Ezogelin Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb1.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton2 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Düğün"
                        toastyazi.text = "Düğün Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb2.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton3 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Mercimek"
                        toastyazi.text = "Mercimek Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb3.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton4 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Brokoli"
                        toastyazi.text = "Brokoli Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb4.text.toString())
                            startActivity(gecis3)

                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton5 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Kelle Paça"
                        toastyazi.text = "Kelle Paça Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb5.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton6 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Yayla"
                        toastyazi.text = "Yayla Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb6.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton7 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Şehriye"
                        toastyazi.text = "Şehriye Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb7.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton8 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Domates"
                        toastyazi.text = "Domates Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb8.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton9 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Tarhana"
                        toastyazi.text = "Tarhana Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb9.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton10 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Mantar"
                        toastyazi.text = "Mantar Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb10.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton11 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "İşkembe"
                        toastyazi.text = "İşkembe Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb11.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                }else if (R.id.radioButton12 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.custom_toast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.tv_text)
                        var isim = "Tavuk"
                        toastyazi.text = "Tavuk Çorbası Güzel Seçim"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, dorduncusayfa::class.java)
                            gecis3.putExtra("isim2",rb12.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                }
            }
            if (x==0){

                button.setOnClickListener {
                    val alertD = Dialog(this)
                    val alertTasarim = layoutInflater.inflate(R.layout.ozel_alert,null)
                    val geriDon = alertTasarim.findViewById<TextView>(R.id.textView7)
                    var hayir = alertTasarim.findViewById<TextView>(R.id.textHayir)
                    hayir.visibility = View.INVISIBLE
                    var evet = alertTasarim.findViewById<TextView>(R.id.textEvet)
                    evet.visibility = View.INVISIBLE
                    alertD.setContentView(alertTasarim)
                    alertD.setCancelable(false)
                    alertD.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    alertD.show()
                    geriDon.setOnClickListener {
                        alertD.dismiss()
                    }

                    }

                }

            }


        }






        }



