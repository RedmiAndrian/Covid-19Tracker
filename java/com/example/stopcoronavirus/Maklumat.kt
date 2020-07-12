package com.example.stopcoronavirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_maklumat.*

class Maklumat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maklumat)
        Glide.with(this).load(R.drawable.covid19).into(virus)
    }
}