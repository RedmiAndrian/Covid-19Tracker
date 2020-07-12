package com.example.stopcoronavirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_my_bio.*

class MyBio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_bio)
        Glide.with(this).load(R.drawable.smsm).into(sekolah)
    }
}