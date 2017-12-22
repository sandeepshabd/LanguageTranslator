package com.sandeepshabd.languagetranslator.views

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sandeepshabd.languagetranslator.R

class MainScreenActivity : AppCompatActivity() , IMainScreenView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
    }
}
