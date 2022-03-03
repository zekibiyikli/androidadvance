package com.example.study.recyclerview.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.study.R
import com.example.study.recyclerview.model.RecyclerviewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

class RecyclerviewAdapter (val itemList: ArrayList<RecyclerviewModel>,
                           val context:Context,
                           val clickListener: (RecyclerviewModel,Int) -> Unit) :
    RecyclerView.Adapter<RecyclerviewViewHolder>() {

    var selectPosition:Int=0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewViewHolder {
        return RecyclerviewViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recyclerview, parent, false))
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerviewViewHolder, position: Int) {
        holder.bind(itemList[position], context)
        if (itemList[position].isSelect){
            selectPosition=position
        }
        holder.itemView.setOnClickListener { clickListener(itemList[position],position) }
    }

    fun addItem(item:RecyclerviewModel){
        itemList.add(item)
        notifyDataSetChanged()
    }
    fun removeItemWithItem(item:RecyclerviewModel){
        itemList.remove(item)
        notifyDataSetChanged()
    }
    fun removeItemWithPosition(position:Int){
        itemList.removeAt(position)
        notifyDataSetChanged()
    }
    fun changeSelect(newPosition:Int){
        itemList[selectPosition].isSelect=false
        itemList[newPosition].isSelect=true
        notifyItemChanged(selectPosition)
        notifyItemChanged(newPosition)
        selectPosition=newPosition
    }
}