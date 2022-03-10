package com.example.study.alertdialog

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.study.R

class CustomDialog {
    fun showDialog(context: Context,
                   text: String,
                   imageUrl:String,
                   positiveClick: () -> Int,
                   negativeClick: () -> Int){

        val dialog = Dialog(context, R.style.AlertDialogSlideAnim)
        dialog.setContentView(R.layout.dialog_custom)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setGravity(Gravity.BOTTOM)
        val titleAlertText = dialog.findViewById<TextView>(R.id.title)
        titleAlertText.text = text
        val image = dialog.findViewById<ImageView>(R.id.image)
        Glide.with(context).load(imageUrl).into(image)
        val positiveButton = dialog.findViewById<Button>(R.id.btnOk)
        positiveButton.setOnClickListener {
            positiveClick()
            dialog.dismiss()
        }
        val negativeButton = dialog.findViewById<Button>(R.id.btnCancel)
        negativeButton.setOnClickListener{
            negativeClick()
            dialog.dismiss()
        }
        dialog.show()
    }

}