package com.example.study.messages

import android.animation.ValueAnimator
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.study.R
import android.view.WindowManager
import androidx.constraintlayout.widget.Guideline

class DialogMessages {
    lateinit var dialog:Dialog
    var height:Int=0
    lateinit var baseLayout:ConstraintLayout
    lateinit var guideline: Guideline
    lateinit var layoutParams:WindowManager.LayoutParams
    fun showDialog(context: Context, text: String){
        dialog = Dialog(context, R.style.full_screen_dialog)
        layoutParams = WindowManager.LayoutParams()
        dialog.setContentView(R.layout.dialog_messages)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setGravity(Gravity.TOP)
        dialog.window?.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT)
        dialog.window?.setDimAmount(0f);
        val titleAlertText = dialog.findViewById<TextView>(R.id.title)
        baseLayout = dialog.findViewById(R.id.baseLayout)
        guideline=dialog.findViewById(R.id.guideline2)
        titleAlertText.text = text
        val positiveButton = dialog.findViewById<Button>(R.id.btnOk)
        positiveButton.setOnClickListener {
            closeDialog()
        }
        height=baseLayout.layoutParams.height
        openDialog()
        dialog.show()
    }

    fun openDialog(){
        val va = ValueAnimator.ofFloat(0f, 0.15f)
        va.duration = 500
        va.addUpdateListener { animation ->
            /*val lp = baseLayout.getLayoutParams()
            lp.height =  (animation.animatedValue as Float).toInt()
            baseLayout.setLayoutParams(lp)*/
            guideline.setGuidelinePercent((animation.animatedValue as Float))
        }
        va.start()
    }

    fun closeDialog(){
        val va = ValueAnimator.ofFloat( 0.15f,0f)
        va.duration = 500
        va.addUpdateListener { animation ->
            /*val lp = baseLayout.getLayoutParams()
            lp.height =  (animation.animatedValue as Float).toInt()
            baseLayout.setLayoutParams(lp)*/
            guideline.setGuidelinePercent((animation.animatedValue as Float))
            if (animation.animatedValue==0f){
                dialog.dismiss()
            }
        }
        va.start()
    }

}