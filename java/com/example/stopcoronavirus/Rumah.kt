package com.example.stopcoronavirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rumah.*

class Rumah : AppCompatActivity() {
    val perkara = arrayOf<String>(
        "1. Ulangkaji mata pelajaran sebelum waktu pembukaan semula sekolah.",
        "2. Belajar perkara baharu (bahasa asing, seni pertahanan diri).",
        "3. Meluangkan masa bersama keluarga.",
        "4. Bersenam."
    )
    val gambar = arrayOf<Int>(
        R.drawable.study,
        R.drawable.learning,
        R.drawable.family,
        R.drawable.exercise
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah)
        val myListAdapter = MyListAdapter(this, perkara, gambar)
        myListView.adapter = myListAdapter
    }
}