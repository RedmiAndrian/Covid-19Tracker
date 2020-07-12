package com.example.stopcoronavirus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_langkah_pencegahan.*

class LangkahPencegahan : AppCompatActivity() {
    val langkah = arrayOf<String>(
        "1. Basuh tangan dengan kerap menggunakan air dan sabun ataupun menggunakan 'hand sanitizer'.",
        "2. Kekalkan jarak satu meter (penjarakan sosial) apabila berada di tempat awam.",
        "3. Gunakan topeng apabila anda bergejala.",
        "4. Jangan sentuh muka apabila tangan anda kotor.",
        "5. Duduk di rumah. Hanya keluar untuk melakukan urusan penting sahaja."
    )
    val image = arrayOf<Int>(
        R.drawable.handwash,
        R.drawable.sosialdis,
        R.drawable.mask,
        R.drawable.face,
        R.drawable.myhome
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_langkah_pencegahan)
        val myListAdapter = MyListAdapter(this,langkah,image)
        listView.adapter = myListAdapter
    }
}