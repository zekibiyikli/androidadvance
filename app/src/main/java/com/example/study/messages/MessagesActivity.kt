package com.example.study.messages

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.study.R
import com.example.study.databinding.ActivityMessagesBinding
import com.example.study.databinding.ActivityMvvmBinding
import com.google.android.material.snackbar.Snackbar
import com.example.study.MainActivity







class MessagesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMessagesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSystem.setOnClickListener {
            messageSystem()
        }
        binding.btnLog.setOnClickListener {
            messageLog()
        }
        binding.btnToast.setOnClickListener {
            messageToast()
        }
        binding.btnSnackbar.setOnClickListener {
            messageSnackbar1()
        }
        binding.btnSnackbar2.setOnClickListener {
            messageSnackbar2()
        }
        binding.btnDialog.setOnClickListener {
            messageDialog()
        }

    }

    fun messageSystem(){
        System.out.print("Test1")
        System.out.println("Test2")
        System.err.print("Test3")
        System.err.println("Test4")
    }

    fun messageLog(){
        Log.e("Zeki","Test")
    }

    fun messageToast(){
        Toast.makeText(this,"Test",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Test",Toast.LENGTH_LONG).show()
    }

    fun messageSnackbar1(){
        val snackbar = Snackbar.make(binding.baseLayout, "Test", Snackbar.LENGTH_LONG)
        snackbar.show()
    }

    fun messageSnackbar2(){
        val snackbar = Snackbar.make(binding.baseLayout, "Test", Snackbar.LENGTH_LONG)
        snackbar.setAction("Geri", object : View.OnClickListener{
            override fun onClick(p0: View?) {
                snackbar.dismiss()
            }
        })
        snackbar.show()
    }

    fun messageDialog(){
        DialogMessages().showDialog(this,"Test")
    }
}