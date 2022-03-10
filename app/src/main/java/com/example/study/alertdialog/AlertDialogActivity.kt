package com.example.study.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.study.R
import com.example.study.databinding.ActivityAlertDialogBinding
import com.example.study.databinding.ActivityRecyclerviewBinding

class AlertDialogActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        var btnBasic=findViewById<Button>(R.id.btnBasic)
        var btnCustom=findViewById<Button>(R.id.btnCustom)

        btnBasic.setOnClickListener {
            setBasic()
        }
        btnCustom.setOnClickListener {
            setCustom()
        }
    }

    fun setBasic(){
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage("Basic Alert Dialog ?")
            .setCancelable(false)
            .setPositiveButton("Ok") { dialog, id ->
                dialog.cancel()
            }
            .setNegativeButton("Cancel") { dialog, id ->
                dialog.cancel()
            }
            .setNeutralButton("Maybe") { dialog, id ->
                dialog.cancel()
            }
            .setIcon(R.drawable.ic_launcher_foreground)
        val alert = dialogBuilder.create()
        alert.setTitle("Title")
        alert.show()
    }

    fun setCustom(){
        var positiveButton={
            Log.e("Zeki","Positive")
        }
        var negativeButton={
            Log.e("Zeki","Positive")
        }
        CustomDialog().showDialog(this,"Zeki","https://cdn.pixabay.com/photo/2019/12/11/21/18/landscape-4689328_960_720.jpg",positiveButton,negativeButton)

    }
}