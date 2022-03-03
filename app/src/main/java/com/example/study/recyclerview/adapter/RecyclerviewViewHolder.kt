package com.example.study.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.study.R
import com.example.study.recyclerview.model.RecyclerviewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

class RecyclerviewViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    val image: ImageView = itemView.findViewById(R.id.image)
    val imgSelect: ImageView = itemView.findViewById(R.id.imgSelect)

    fun bind(item: RecyclerviewModel,context:Context) {
        Glide.with(context)
            .load(item.imageUrl)
            .into(image)

        if(item.isSelect){
            imgSelect.visibility= View.VISIBLE
        }else{
            imgSelect.visibility= View.INVISIBLE
        }
    }

}