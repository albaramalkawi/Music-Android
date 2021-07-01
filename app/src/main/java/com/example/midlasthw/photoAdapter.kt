package com.example.midlasthw

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class photoAdapter(var con: Context): RecyclerView.Adapter<photoAdapter.ViewHolder>() {
    private var dataList= emptyList<dataModel>()
    private lateinit var VonListner:onListner

    internal fun setDataList(dataList:List<dataModel>,onListner: onListner){

        this.dataList=dataList
        this.VonListner=onListner
    }

    class ViewHolder(itemView: View ,onListner: onListner):RecyclerView.ViewHolder(itemView),View.OnClickListener {
        var image:ImageView
        var title:TextView
        var onListner:onListner


        init {
            image=itemView.findViewById(R.id.image1)
            title=itemView.findViewById(R.id.TV1)
            this.onListner=onListner
            itemView.setOnClickListener(this)

        }
        override fun onClick(v: View?) {
            onListner.onClick(absoluteAdapterPosition)
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): photoAdapter.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.photo_layout,parent,false)
       return ViewHolder(view,VonListner)
    }

    override fun getItemCount()=dataList.size

    override fun onBindViewHolder(holder: photoAdapter.ViewHolder, position: Int) {
       var data = dataList[position]

        holder.title.text=data.title
        holder.image.setImageResource(data.image)


    }


public interface onListner {
    fun onClick(position: Int)
}
}