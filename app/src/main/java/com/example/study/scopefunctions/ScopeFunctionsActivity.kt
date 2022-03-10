package com.example.study.scopefunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.study.R


class ScopeFunctionsActivity : AppCompatActivity() {

    var exampleLet:String?=null
    var exampleRun:String?=null
    var exampleWith:String="Deneme With"
    var exampleApply:String="Deneme Apply"
    var exampleAlso:String="Deneme Also"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope_functions)

        functionLet()
        functionRun()
        functionWith()
        functionApply()
        functionAlso()
    }

    fun functionLet(){
        exampleLet="Zeki"
        // let => null kontrolü yapar null değilse bloğu çaıştırır
        exampleLet.let {
            Log.e("Zeki","Null Değil")
        }
        //değişkene atama yapılabilr
        var resultLet=exampleLet?.let {
            if (it.length>2){
                "Large"
            }else{
                "Tall"
            }
        }
        Log.e("Zeki",resultLet!!)
    }

    fun functionRun(){
        exampleRun="Z"
        // run => let ile aynı sadece lette it dönüyor runda this dönüyor
        exampleRun.run {
            Log.e("Zeki","Null Değil")
        }
        //değişkene atama yapılabilr
        var resultRun=exampleRun?.run {
            if (this.length>2){
                "Large"
            }else{
                "Tall"
            }
        }
        Log.e("Zeki",resultRun!!)

        var resultRun2=run{
            "Deneme"
        }
        Log.e("Zeki",resultRun2)
    }

    fun functionWith(){
        //with ile örneğin bir model içindeki değerleri değişirmek istiyorsak teker teker model.value yazmak yerine böyle yazabiliriz
        var scopeFunctionsModel=ScopeFunctionsModel(1,"Zeki","Çorum")
        with(scopeFunctionsModel){
            id=2
            name="Zeki2"
            country="Çorum2"
        }
        Log.e("Zeki","${scopeFunctionsModel.id} => ${scopeFunctionsModel.name} => ${scopeFunctionsModel.country}")

        with(exampleWith){
            Log.e("Zeki",this)
        }
    }

    fun functionApply(){
        //Verilen kod bloğunu nesneye uygula ve nesneyi geri döndür şeklinde yorumlanabilir
        var scopeFunctionsModel=ScopeFunctionsModel(1,"Zeki","Çorum")
        var model=scopeFunctionsModel.apply {
            id=2
            name="Zeki2"
            country="Çorum2"
        }
        Log.e("Zeki","${model.id} => ${model.name} => ${model.country}")

    }

    fun functionAlso(){
        //Nesneyi geri döndür ayrıca verilen kod bloğunu çalıştır.
        var scopeFunctionsModel=ScopeFunctionsModel(1,"Zeki","Çorum")
        scopeFunctionsModel.also {
            Log.e("Zeki",it.country)
        }.run {
            country="Çorum2"
        }

        Log.e("Zeki","${scopeFunctionsModel.country}")

    }


}