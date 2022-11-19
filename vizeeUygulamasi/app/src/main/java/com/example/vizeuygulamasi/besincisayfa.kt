package com.example.vizeuygulamasi


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View

import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class besincisayfa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_besincisayfa)
        val intent = intent
        var ilkYazi = findViewById<TextView>(R.id.textView18)
        val malzemeText =findViewById<TextView>(R.id.textView23)
        var extraIstek = findViewById<TextView>(R.id.textView25)
        var cikisYap = findViewById<ImageView>(R.id.sonlandir)
        var tekrarSiparis = findViewById<TextView>(R.id.yeniSiparis)
        var yeniSiparis = findViewById<TextView>(R.id.yeniSiparis)

        yeniSiparis.setOnClickListener {
            var siparisEkraninaDon = Intent(this@besincisayfa,MainActivity::class.java)
            startActivity(siparisEkraninaDon)
        }

        val sayici = object :
        CountDownTimer(100000,500){
            override fun onTick(p0: Long) {
                if (yeniSiparis.visibility == View.VISIBLE){
                    yeniSiparis.visibility = View.INVISIBLE
                }else{
                    yeniSiparis.visibility = View.VISIBLE
                }
            }

            override fun onFinish() {
                return
            }

        }
        sayici.start()

//--------------------------------------------------ÖNCEKİ SAYFADAN GELENLER---------------------------------------------------------//

        val corbaCesidi = intent.getStringExtra("corbaCesidi")
        val tuzOrani = intent.getStringExtra("tuzOrani")
        val aciOrani = intent.getStringExtra("aciOrani")
        val malzeme1 = intent.getStringExtra("Sarimsak")
        val malzeme2 = intent.getStringExtra("Nane")
        val malzeme3 = intent.getStringExtra("Dil")
        val malzeme4 = intent.getStringExtra("Terbiye")
        val malzeme5 = intent.getStringExtra("Beyin")
        val malzeme6 = intent.getStringExtra("Sirke")
        val malzeme7 = intent.getStringExtra("Krema")
        val malzeme8 = intent.getStringExtra("Yağ")
        val malzeme9 = intent.getStringExtra("Kaşar")
        val malzeme10 = intent.getStringExtra("Kıtır")
        val malzeme11 = intent.getStringExtra("Limon")
        val malzeme12 = intent.getStringExtra("Toz Biber")
        val istek = intent.getStringExtra("istek")

//-----------------------------------------------------------------------------------------------------------------------------------//

//-------------------------------------------HER BİR ÇORBA İLE ETKİLEŞİMİN SONUÇLARI------------------------------------------------//
        if (corbaCesidi == "Ezogelin"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme8} ${malzeme10} ${malzeme11} ${malzeme12} "

        }
        if (corbaCesidi == "Düğün"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme8} ${malzeme10} ${malzeme11} ${malzeme12}"

        }
        if (corbaCesidi == "Mercimek"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme8} ${malzeme10} ${malzeme11} ${malzeme12}"

        }
        if (corbaCesidi == "Brokoli"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme7}"

        }
        if (corbaCesidi == "Kelle Paça"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme1} ${malzeme3} ${malzeme5} ${malzeme6} ${malzeme8} ${malzeme11}"

        }
        if (corbaCesidi == "Yayla"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme8} ${malzeme10} ${malzeme12}"

        }
        if (corbaCesidi == "Şehriye"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme8} ${malzeme11} ${malzeme12}"

        }
        if (corbaCesidi == "Domates"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme2} ${malzeme4} ${malzeme8} ${malzeme9} ${malzeme10} ${malzeme11} ${malzeme12}"

        }
        if (corbaCesidi == "Tarhana"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme8} ${malzeme12}"

        }
        if (corbaCesidi == "Mantar"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme7}"

        }
        if (corbaCesidi == "İşkembe"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme1} ${malzeme6} ${malzeme8} ${malzeme11} ${malzeme12}"

        }
        if (corbaCesidi == "Tavuk"){
            ilkYazi.text = "Bir ${corbaCesidi} Çorbası Çeeeeek ${tuzOrani} Ve ${aciOrani} Olsun"
            extraIstek.text = "Extra İstek : ${istek}"
            malzemeText.text = " ${malzeme7} ${malzeme8} ${malzeme11}"

        }
        yeniSiparis.setOnClickListener {
           var tekrarSiparis = Intent(this,MainActivity::class.java)
            startActivity(tekrarSiparis)
            finish()
        }

        cikisYap.setOnClickListener {
            val alertD = Dialog(this@besincisayfa)
            val alertTasarim = layoutInflater.inflate(R.layout.ozel_alert, null)
            val istekEminlik = alertTasarim.findViewById<TextView>(R.id.textView6)
            val geriDon = alertTasarim.findViewById<TextView>(R.id.textView7)
            val hayir = alertTasarim.findViewById<TextView>(R.id.textHayir)
            val evet = alertTasarim.findViewById<TextView>(R.id.textEvet)

            geriDon.visibility = View.INVISIBLE
            istekEminlik.text = "Çıkmak istediğinize emin misiniz ?"
            hayir.setOnClickListener {
                alertD.dismiss()
            }
            evet.setOnClickListener {
                alertD.dismiss()
                finish()
            }

            alertD.setContentView(alertTasarim)
            alertD.setCancelable(true)
            alertD.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            alertD.show()
            geriDon.setOnClickListener {
                alertD.dismiss()
            }
        }
    }
        }

