package com.example.stopcoronavirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_symptoms.*

class Symptoms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)
        Glide.with(this).load(R.drawable.demam).into(simptom_image4)
        Glide.with(this).load(R.drawable.batuk).into(simptom_image1)
        Glide.with(this).load(R.drawable.sesak).into(simptom_image2)
        Glide.with(this).load(R.drawable.flu).into(simptom_image3)
    }
}