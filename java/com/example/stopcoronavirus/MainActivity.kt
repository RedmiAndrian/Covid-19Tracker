package com.example.stopcoronavirus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import javax.xml.transform.ErrorListener

class MainActivity : AppCompatActivity() {

    lateinit var mQueue : RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mQueue = Volley.newRequestQueue(this)

        Glide.with(this).load(R.drawable.overview).into(overview)
        Glide.with(this).load(R.drawable.symptoms).into(simptom)
        Glide.with(this).load(R.drawable.prevention).into(preventionStep)
        Glide.with(this).load(R.drawable.home).into(atHomeTips)
        overview.setOnClickListener {
            val myIntent = Intent(this, Maklumat::class.java)
            startActivity(myIntent)
        }
        simptom.setOnClickListener {
            val myIntent = Intent(this, Symptoms::class.java)
            startActivity(myIntent)
        }
        preventionStep.setOnClickListener {
            val myIntent = Intent(this, LangkahPencegahan::class.java)
            startActivity(myIntent)
        }
        atHomeTips.setOnClickListener {
            val myIntent = Intent(this, Rumah::class.java)
            startActivity(myIntent)
        }

        val url : String = "https://disease.sh/v3/covid-19/all"

        val request = JsonObjectRequest(Request.Method.GET, url, null, Response.Listener {
            val ans : String = it.getString("cases")
            val ans2 : String = it.getString("deaths")
            val ans3 : String = it.getString("recovered")
            cases.text = ans + " jumlah kumulatif orang yang dijangkiti Covid-19."
            deaths.text = ans2 + " orang meninggal dunia akibat dijangkiti Covid-19."
            recovered.text = ans3 + " orang telah sembuh daripada Covid-19."
        }, Response.ErrorListener{
            Toast.makeText(this, "No Connection", Toast.LENGTH_SHORT).show()
        })

        val url2 : String = "https://disease.sh/v3/covid-19/countries/Malaysia"

        val request2 = JsonObjectRequest(Request.Method.GET, url2, null, Response.Listener {
            val malaAns : String = it.getString("cases")
            val malaAns2 : String = it.getString("deaths")
            val malaAns3 : String = it.getString("recovered")
            cases2.text = malaAns + " jumlah kumulatif orang yang dijangkiti Covid-19."
            deaths2.text = malaAns2 + " orang meninggal dunia akibat dijangkiti Covid-19."
            recovered2.text = malaAns3 + " orang telah sembuh daripada Covid-19."
        }, Response.ErrorListener {
            Toast.makeText(this, "No Connection", Toast.LENGTH_SHORT).show()
        })

        mQueue.add(request)
        mQueue.add(request2)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.subItem1 -> {
                val myIntent = Intent(this, MyBio::class.java)
                startActivity(myIntent)
                return true
            }
            R.id.subItem2 -> {
                val myIntent = Intent(this, Urgent::class.java)
                startActivity(myIntent)
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }

    }
}