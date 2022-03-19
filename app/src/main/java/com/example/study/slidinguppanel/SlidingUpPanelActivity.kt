package com.example.study.slidinguppanel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.study.R
import com.sothree.slidinguppanel.SlidingUpPanelLayout




class SlidingUpPanelActivity : AppCompatActivity() {

    lateinit var slidingUpPanelLayout: SlidingUpPanelLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sliding_up_panel)

        slidingUpPanelLayout = findViewById(R.id.sliding_layout)

        slidingUpPanelLayout.addPanelSlideListener(object:SlidingUpPanelLayout.PanelSlideListener{
            override fun onPanelSlide(panel: View?, slideOffset: Float) {

            }

            override fun onPanelStateChanged(panel: View?, previousState: SlidingUpPanelLayout.PanelState?, newState: SlidingUpPanelLayout.PanelState?) {
                if (newState.toString().equals("EXPANDED")){
                    Log.e("Zeki","EXPANDED")
                }else{
                    Log.e("Zeki","COLLAPSED")
                }
            }

        })
    }

    fun methods(){
        slidingUpPanelLayout.panelState = SlidingUpPanelLayout.PanelState.COLLAPSED     // kapatır
        slidingUpPanelLayout.panelState = SlidingUpPanelLayout.PanelState.EXPANDED      // açar
        slidingUpPanelLayout.isTouchEnabled = false                                     // dokunmayı aktif veya disable
        slidingUpPanelLayout.isEnabled=false                                            // devredışı ve aktif etmek için
        slidingUpPanelLayout.panelHeight=200                                            // yükseklik
        slidingUpPanelLayout.shadowHeight=200                                           // gölgelendirme
        slidingUpPanelLayout.anchorPoint=0.5f                                           // kapatmak için kaydırdığında 0.5 olursa yarısında kalır yeni hamle ile kapatılır
    }
}