package com.example.midlasthw

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Second: AppCompatActivity() {
lateinit var lv:ListView
    val amro= arrayOf("كان كل حاجة","ساعة الفراق","نا مش انانى","سبت فراغ كبير","شفت الايام","وهتبتدى الحكايات")
    val mustafa= arrayOf("قبل ما تمشى","لابد نتفارق","لابد نتفارق","بسلم عليك","نا مطمن","لو كنت غالي")
    val asala= arrayOf("دقيقة حياة","اد الحروف","خانات الذكريات","اكتر","سؤال بسيط","لو تعرفوا")
    val ehab= arrayOf("ترجى فيا","مالهمش في الطيب","هلال رمضان","على الجراح قادر","مراسيل","ما تدمعيش يا عين")
    val hamaqi= arrayOf("واحدة واحدة","من قلبي بغني","حاجه مستخبيه","احلى حاجة فيكى","نفسي ابقى جنبه","يا ستار")
    val yara= arrayOf("ما بعرف","عايش بعيونى","انت مني ","قول","بيت حبيبي","اه منك يا هوى")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        lv = findViewById(R.id.LV)

        val Actionbar = supportActionBar
        Actionbar!!.setTitle("songs")

        Actionbar.setDisplayHomeAsUpEnabled(true)
        Actionbar.setDisplayHomeAsUpEnabled(true)

        val Value = intent.getStringExtra("position")

        println(Value)

        if (Value == "0") {
            amrofun()
        } else if (Value == "1") {
            mustafafun()
        } else if (Value == "2") {
            asalafun()
        } else if (Value == "3") {
            hamaqifun()
        } else if (Value == "4") {
            ehabfun()
        }
        else if (Value == "5") {
            mustafafun()
        }
        else if (Value == "6") {
            yarafun()
        }
        
    }


        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
        }





    private fun amrofun() {
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,amro)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if (i == 0) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/shoft_el_ayam/Kan_Kol_Haga_Melody4Arab.Com.mp3"))
                startActivity(intent)

            } else if (i == 1) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/shoft_el_ayam/Saet_El_Forak_Melody4Arab.Com.mp3"))
                startActivity(intent)

            } else if (i == 2) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/shoft_el_ayam/Ana_Mosh_Anani_Melody4Arab.Com.mp3"))
                startActivity(intent)

            } else if (i == 3) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/al_leila/Sebt_Faragh_Kibeer_melody4arab.com.mp3"))
                startActivity(intent)

            } else if (i == 4) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/shoft_el_ayam/Shoft_El_Ayam_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            if (i == 5) {
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/amr_diab/shoft_el_ayam/We_Hatebtady_El_Hekayat_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }


}
    }



    fun mustafafun(){
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,mustafa)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if(i==0){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("https://mp3.panet.co.il/media/Moustafa-Amar/Panet.co.il_Moustafa-Amar_Hanona.mp3"))
                startActivity(intent)

            }
            else if(i==1){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/moustafa_amar/sekket_el_ashqeen/Seket_El-Ashqeen_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else  if(i==2){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/moustafa_amar/harem_karem/Baslim_Alik_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else if(i==3){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/moustafa_amar/ana_metamen/Ana_Metamen_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else if(i==4){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/moustafa_amar/monaya/Law_Kont_Ghaly_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            if(i==5){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/moustafa_amar/hayaty/Gat_Tesalihny_melody4arab.com.mp3"))
                startActivity(intent)

            }

        }


    }


    fun asalafun(){
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,asala)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if(i==0){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/60_deaea_hayat/60_Deaea_Hayat_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            else if(i==1){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/qad_el_hourouf/Ad_El_Hourouf__melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else  if(i==2){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/60_deaea_hayat/Khanat_El_Zekrayat_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            else if(i==3){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/hiyatie/Aktar_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else if(i==4){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/60_deaea_hayat/Soaal_Baset_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            if(i==5){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/law_ta3rafo/Law_Taarafou_melody4arab.com.mp3"))
                startActivity(intent)

            }

        }


    }



    fun hamaqifun(){
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,hamaqi)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if(i==0){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/kheles_el_kalam/Wahda_Wahda_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else if(i==1){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/mn_alby_baghany/Mn_Alby_Baghany_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else  if(i==2){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/mn_alby_baghany/Haga_Mestakhabeya_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else if(i==3){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/kheles_el_kalam/Ahla_Haga_Feeki_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else if(i==4){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/mn_alby_baghany/Nefsi_Abaa_Ganbo_melody4arab.com.mp3"))
                startActivity(intent)

            }
            if(i==5){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/mohamed_hamaki/kol_youm_men_dah/Ya_Sattar_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }

        }}
    fun ehabfun(){
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,ehab)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if(i==0){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/habeb_al-2b_/Tetraga%20Fea_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else if(i==1){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/ye3shaq_el_2amar/Malhomshe_Fe_El_Tayeb_melody4arab.com.mp3\n"))
                startActivity(intent)

            }
            else  if(i==2){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/aela_raswl_allah/Hilal_Ramadan_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else if(i==3){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/leeh_el-khsam_/3ala_El-Jirah_Qadir_melody4arab.com_.mp3"))
                startActivity(intent)

            }
            else if(i==4){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/marasil/Marasil_melody4arab.com.mp3"))
                startActivity(intent)

            }
            if(i==5){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/egypt/ehab_tawfik/hom_kelmten_/Ma%20Tidm3ish%20Ya%20Ein%20_melody4arab.com_.mp3"))
                startActivity(intent)

            }

        }}
    fun yarafun(){
        val arrayAdapter:ArrayAdapter<String>

        arrayAdapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,yara)
        lv.adapter=arrayAdapter

        lv.setOnItemClickListener { parent, view, i, id ->
            if(i==0){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/lebnan/yara/ayech_bi_oyouni/Ma_Baaref_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            else if(i==1){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/lebnan/yara/enta_menni/Enta_Menni_melody4arab.com.mp3"))
                startActivity(intent)

            }
            else  if(i==2){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/syria/asalah_/60_deaea_hayat/Khanat_El_Zekrayat_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            else if(i==3){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/lebnan/yara/ayech_bi_oyouni/Oul_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            else if(i==4){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/lebnan/yara/ayech_bi_oyouni/Beyt_Habibi_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }
            if(i==5){
                var intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse("http://melody4arab.com/music/lebnan/yara/ayech_bi_oyouni/Ah_Mennak_Ya_Hawa_Melody4Arab.Com.mp3"))
                startActivity(intent)

            }

        }}
}