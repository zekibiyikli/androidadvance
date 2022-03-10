package com.example.study.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.study.R
import com.example.study.databinding.ActivityRecyclerviewBinding
import com.example.study.recyclerview.adapter.RecyclerviewAdapter
import com.example.study.recyclerview.model.RecyclerviewModel
import dagger.hilt.android.AndroidEntryPoint

class RecyclerviewActivity : AppCompatActivity() {

    var changeIndex=1
    lateinit var adapter:RecyclerviewAdapter
    lateinit var rv:RecyclerView
    lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        rv=findViewById(R.id.rvList)
        btn=findViewById(R.id.btnChange)

        initList(true)

        btn.setOnClickListener {
            if (changeIndex==3){
                changeIndex=1
            }else{
                changeIndex++
            }
            initList(false)
        }
    }

    private fun initList(isFirst:Boolean){
        var list=getExampleList()
        var layoutManager:RecyclerView.LayoutManager
        if (changeIndex==2){
            layoutManager=GridLayoutManager(this,3)
        }else if(changeIndex==3){
            layoutManager=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        }else{
            layoutManager=LinearLayoutManager(this)
        }
        rv.layoutManager=layoutManager
        if (isFirst){
            adapter=RecyclerviewAdapter(list,this,::onItemClickListener)
            rv.adapter=adapter
        }
    }

    private fun onItemClickListener(item:RecyclerviewModel, position:Int){
        adapter.changeSelect(position)
    }

    private fun getExampleList():ArrayList<RecyclerviewModel>{
        var resultList= arrayListOf<RecyclerviewModel>()
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",true))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        resultList.add(RecyclerviewModel("https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",false))
        return resultList
    }

}