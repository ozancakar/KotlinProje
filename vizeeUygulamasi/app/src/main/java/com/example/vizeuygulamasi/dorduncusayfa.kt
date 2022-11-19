package com.example.vizeuygulamasi


import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.renderscript.ScriptGroup.Binding
import android.view.View
import android.widget.*
import com.google.android.material.progressindicator.BaseProgressIndicator

class dorduncusayfa : AppCompatActivity() {


    @SuppressLint("UseSwitchCompatOrMaterialCode", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dorduncusayfa)

        val istek = findViewById<EditText>(R.id.editTextIstek)


//------------------ÖNCEKİ SAYFADAN ALINANLAR-----------------------//
        val intent = getIntent()
        var corbaCesidi = intent.getStringExtra("isim2")
        var corbaAdi = findViewById<TextView>(R.id.corbaEslestir)


        //SWITCHLER
        var sw1 = findViewById<Switch>(R.id.switch1)
        sw1.visibility = View.INVISIBLE
        var sw2 = findViewById<Switch>(R.id.switch2)
        sw2.visibility = View.INVISIBLE
        var sw3 = findViewById<Switch>(R.id.switch3)
        sw3.visibility = View.INVISIBLE
        var sw4 = findViewById<Switch>(R.id.switch4)
        sw4.visibility = View.INVISIBLE
        var sw5 = findViewById<Switch>(R.id.switch5)
        sw5.visibility = View.INVISIBLE
        var sw6 = findViewById<Switch>(R.id.switch6)
        sw6.visibility = View.INVISIBLE
        var sw7 = findViewById<Switch>(R.id.switch7)
        sw7.visibility = View.INVISIBLE
        var sw8 = findViewById<Switch>(R.id.switch8)
        sw8.visibility = View.INVISIBLE
        var sw9 = findViewById<Switch>(R.id.switch9)
        sw9.visibility = View.INVISIBLE
        var sw10 = findViewById<Switch>(R.id.switch10)
        sw10.visibility = View.INVISIBLE
        var sw11 = findViewById<Switch>(R.id.switch11)
        sw11.visibility = View.INVISIBLE
        var sw12 = findViewById<Switch>(R.id.switch12)
        sw12.visibility = View.INVISIBLE
//    ----------------------------------------------------------------------------------//


//------------------TUZ BARI VE TETİKLENECEKLER-----------------------------//


        var tuzBari = findViewById<SeekBar>(R.id.seekBar1)
        var tuzOrani = ""
        tuzBari.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2) {

                    val alertD = Dialog(this@dorduncusayfa)
                    val alertTasarim = layoutInflater.inflate(R.layout.ozel_alert, null)
                    val istekEminlik = alertTasarim.findViewById<TextView>(R.id.textView6)
                    val geriDon = alertTasarim.findViewById<TextView>(R.id.textView7)
                    val hayir = alertTasarim.findViewById<TextView>(R.id.textHayir)
                    val evet = alertTasarim.findViewById<TextView>(R.id.textEvet)
                    var tuzResmi = alertTasarim.findViewById<ImageView>(R.id.imageView12)
                    tuzResmi.setImageResource(R.drawable.tuz)
                    geriDon.visibility = View.INVISIBLE
                    istekEminlik.text = "Bu kadar tuz istediğinize emin misiniz ?"
                    hayir.setOnClickListener {
                        tuzBari.progress = 1
                        alertD.dismiss()
                    }
                    evet.setOnClickListener {
                        alertD.dismiss()
                        Toast.makeText(
                            this@dorduncusayfa,
                            "Çorbanız bol tuzlu hazırlanacaktır.",
                            Toast.LENGTH_LONG
                        ).show()
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

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })


//------------------ACI BARINDAN SONRA TETİKLENECEKLER--------------------//
        var aciBari = findViewById<SeekBar>(R.id.seekBar2)
        var aciOrani = ""
        aciBari.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (p1 == 2) {

                    val alertD = Dialog(this@dorduncusayfa)
                    val alertTasarim = layoutInflater.inflate(R.layout.ozel_alert, null)
                    val istekEminlik = alertTasarim.findViewById<TextView>(R.id.textView6)
                    val geriDon = alertTasarim.findViewById<TextView>(R.id.textView7)
                    val hayir = alertTasarim.findViewById<TextView>(R.id.textHayir)
                    val evet = alertTasarim.findViewById<TextView>(R.id.textEvet)
                    var aciResmi = alertTasarim.findViewById<ImageView>(R.id.imageView12)
                    aciResmi.setImageResource(R.drawable.pulbiber)
                    geriDon.visibility = View.INVISIBLE
                    istekEminlik.text = "Bu kadar acı istediğinize emin misiniz ?"
                    hayir.setOnClickListener {
                        aciBari.progress = 1
                        alertD.dismiss()
                    }
                    evet.setOnClickListener {
                        alertD.dismiss()
                        Toast.makeText(
                            this@dorduncusayfa,
                            "Çorbanız bol acılı hazırlanacaktır.",
                            Toast.LENGTH_LONG
                        ).show()


                    }

                    alertD.setContentView(alertTasarim)
                    alertD.setCancelable(true)
                    alertD.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    alertD.show()

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
//-----------------------------------SWITCH TANIMLAMALARI VE ETKILESIMLER--------------------------------------//
        var sw1Yazi = ""
        var sw2Yazi = ""
        var sw3Yazi = ""
        var sw4Yazi = ""
        var sw5Yazi = ""
        var sw6Yazi = ""
        var sw7Yazi = ""
        var sw8Yazi = ""
        var sw9Yazi = ""
        var sw10Yazi = ""
        var sw11Yazi = ""
        var sw12Yazi = ""
        sw1.setOnCheckedChangeListener { _, isChecked ->
            if (sw1.isChecked) {
                sw1Yazi = "Sarimsak,"
            } else {
                sw1Yazi = ""
            }

        }
        sw2.setOnCheckedChangeListener { _, isChecked ->
            if (sw2.isChecked) {
                sw2Yazi = "Nane,"
            } else {
                sw2Yazi = ""
            }

        }
        sw3.setOnCheckedChangeListener { _, isChecked ->
            if (sw3.isChecked) {
                sw3Yazi = "Dil,"
            } else {
                sw3Yazi = ""
            }

        }
        sw4.setOnCheckedChangeListener { _, isChecked ->
            if (sw4.isChecked) {
                sw4Yazi = "Terbiye,"
            } else {
                sw4Yazi = ""
            }

        }
        sw5.setOnCheckedChangeListener { _, isChecked ->
            if (sw5.isChecked) {
                sw5Yazi = "Beyin,"
            } else {
                sw5Yazi = ""
            }

        }
        sw6.setOnCheckedChangeListener { _, isChecked ->
            if (sw6.isChecked) {
                sw6Yazi = "Sirke,"
            } else {
                sw6Yazi = ""
            }

        }
        sw7.setOnCheckedChangeListener { _, isChecked ->
            if (sw7.isChecked) {
                sw7Yazi = "Krema,"
            } else {
                sw7Yazi = ""
            }

        }
        sw8.setOnCheckedChangeListener { _, isChecked ->
            if (sw8.isChecked) {
                sw8Yazi = "Yağ,"
            } else {
                sw8Yazi = ""
            }

        }
        sw9.setOnCheckedChangeListener { _, isChecked ->
            if (sw9.isChecked) {
                sw9Yazi = "Kaşar,"
            } else {
                sw9Yazi = ""
            }

        }
        sw10.setOnCheckedChangeListener { _, isChecked ->
            if (sw10.isChecked) {
                sw10Yazi = "Kıtır,"
            } else {
                sw10Yazi = ""
            }

        }
        sw11.setOnCheckedChangeListener { _, isChecked ->
            if (sw11.isChecked) {
                sw11Yazi = "Limon,"
            } else {
                sw11Yazi = ""
            }

        }
        sw12.setOnCheckedChangeListener { _, isChecked ->
            if (sw12.isChecked) {
                sw12Yazi = "Toz Biber,"
            } else {
                sw12Yazi = ""
            }
        }

//----------------------SİPRAİŞTEN SONRA BİR SONRAKİ SAYFA İLE ETKİLEŞİM------------------------//
        var siparisVer = findViewById<ImageView>(R.id.siparisVer)
        siparisVer.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.ozel_alert, null)
            val tekrarDene = tasarim.findViewById<TextView>(R.id.textView7)
            val alert = Dialog(this@dorduncusayfa)
            var hayir = tasarim.findViewById<TextView>(R.id.textHayir)
            var evet = tasarim.findViewById<TextView>(R.id.textEvet)
            var yazi = tasarim.findViewById<TextView>(R.id.textView5)
            var durum = tasarim.findViewById<TextView>(R.id.textView6)
            yazi.text = "Siparaşinizin durumu"
            durum.text = "Siparşiniz hazırlanacak devam etmek istiyor musunuz ?"
            tekrarDene.text = "Tekrar kontrol etmek istiyorum"
            hayir.visibility = View.INVISIBLE
            alert.setContentView(tasarim)
            alert.setCancelable(true)
            alert.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            alert.show()

            tekrarDene.setOnClickListener {
                alert.dismiss()
            }

            evet.setOnClickListener {
                if (tuzBari.progress == 0) {
                    tuzOrani = "Tuzsuz"
                }
                if (tuzBari.progress == 1) {
                    tuzOrani = "Orta Tuzlu"
                }
                if (tuzBari.progress == 2) {
                    tuzOrani = "Bol Tuzlu"
                }
                if (aciBari.progress == 0) {
                    aciOrani = "Acısız"
                }
                if (aciBari.progress == 1) {
                    aciOrani = "Orta Acılı"
                }
                if (aciBari.progress == 2) {
                    aciOrani = "Bol Acılı"
                }

            var gecis4 = Intent(this, besincisayfa::class.java)
            gecis4.putExtra("Sarimsak", sw1Yazi)
            gecis4.putExtra("Nane", sw2Yazi)
            gecis4.putExtra("Dil", sw3Yazi)
            gecis4.putExtra("Terbiye", sw4Yazi)
            gecis4.putExtra("Beyin", sw5Yazi)
            gecis4.putExtra("Sirke", sw6Yazi)
            gecis4.putExtra("Krema", sw7Yazi)
            gecis4.putExtra("Yağ", sw8Yazi)
            gecis4.putExtra("Kaşar", sw9Yazi)
            gecis4.putExtra("Kıtır", sw10Yazi)
            gecis4.putExtra("Limon", sw11Yazi)
            gecis4.putExtra("Toz Biber", sw12Yazi)

            gecis4.putExtra("tuzOrani", tuzOrani)
            gecis4.putExtra("aciOrani", aciOrani)
            gecis4.putExtra("istek", istek.text.toString())
            gecis4.putExtra("corbaCesidi", corbaCesidi.toString())
            startActivity(gecis4)

            finish()
        }
    }
//----------------------------------------------------------------------------------------------------------//


//------------------------ÇORBALAR VE TIKLANMA DURUMLARINA GÖRE SWİTCHLERİN DURUMLARI---------------------------//
        if (corbaCesidi == "Ezogelin"){
            corbaAdi.text = "Ezogelin Çorbası"

            sw2.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Düğün"){
            corbaAdi.text = "Düğün Çorbası"
            sw2.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Mercimek"){
            corbaAdi.text = "Mercimek Çorbası"
            sw2.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Brokoli"){
            corbaAdi.text = "Brokoli Çorbası"
            sw7.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Kelle Paça"){
            corbaAdi.text = "Kelle Paça Çorbası"
            sw1.visibility = View.VISIBLE
            sw3.visibility = View.VISIBLE
            sw5.visibility = View.VISIBLE
            sw6.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Yayla"){
            corbaAdi.text = "Yayla Çorbası"
            sw2.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Şehriye"){
            corbaAdi.text = "Şehriye Çorbası"
            sw2.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Domates"){
            corbaAdi.text = "Domates Çorbası"
            sw2.visibility = View.VISIBLE
            sw4.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw9.visibility = View.VISIBLE
            sw10.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Tarhana"){
            corbaAdi.text = "Tarhana Çorbası"
            sw8.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Mantar"){
            corbaAdi.text = "Mantar Çorbası"
            sw7.visibility = View.VISIBLE
        }
        if (corbaCesidi == "İşkembe"){
            corbaAdi.text = "İşkembe Çorbası"
            sw1.visibility = View.VISIBLE
            sw6.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
            sw12.visibility = View.VISIBLE
        }
        if (corbaCesidi == "Tavuk"){
            corbaAdi.text = "Tavuk Çorbası"
            sw7.visibility = View.VISIBLE
            sw8.visibility = View.VISIBLE
            sw11.visibility = View.VISIBLE
        }
//-------------------------------------------------------------------------------------------------------------//
    }
}