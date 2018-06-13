package me.dmba.jiranav.screens

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import me.dmba.jiranav.R

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
