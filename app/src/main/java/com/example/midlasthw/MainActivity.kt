package com.example.midlasthw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity() : AppCompatActivity(),photoAdapter.onListner, Parcelable {

  lateinit var recyclerv:RecyclerView
    lateinit var photoAdapter: photoAdapter

    var dataList= mutableListOf<dataModel>()

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Actionbar=supportActionBar
        Actionbar!!.setTitle("Singers")
        recyclerv=findViewById(R.id.recycleV)
        recyclerv.layoutManager=GridLayoutManager(applicationContext,2)
        photoAdapter= photoAdapter(applicationContext)
        recyclerv.adapter=photoAdapter

        dataList.add(dataModel("عمرو دياب",R.drawable.amro))
        dataList.add(dataModel("ايهاب توفيق",R.drawable.ehab_tawfiq))
        dataList.add(dataModel("اصاله نصري",R.drawable.asala_nasri))
        dataList.add(dataModel("مصطفى قمر",R.drawable.mustafa_qamar))
        dataList.add(dataModel("محمد حماقي",R.drawable.mohammad_hamaqi))
        dataList.add(dataModel("تامر حسني",R.drawable.tamer_hosni))
        dataList.add(dataModel("يارا",R.drawable.yara))

        photoAdapter.setDataList(dataList,this)


    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onClick(position: Int) {
        intent = Intent(applicationContext, Second::class.java)
        println("****  "+ position.toString()+"    ************************************************##########")
        var a=position.toString()
        println("****  "+ a +"   123 ************************************************##########")

        intent.putExtra("position", a.toString())
        startActivity(intent)
    }
}