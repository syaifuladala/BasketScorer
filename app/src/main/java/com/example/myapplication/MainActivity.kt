package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var skor = 0;
        var skordua = 0;
        var textreset = "";

        reset.setOnClickListener {
            skor = 0;
            skordua = 0;
            angka.text = skor.toString();
            angkadua.text = skordua.toString();
            edittext.setText("");
            edittextdua.setText("");
        }

        tambah.setOnClickListener {
            skor = skor + 1;
            Log.d("SKOR", skor.toString());
            angka.text = skor.toString();
        }
        kurang.setOnClickListener {
            skor = skor - 1;
            Log.d("SKOR", skor.toString());
            angka.text = skor.toString();
            if (checkSkor(skor)){
                Toast.makeText(this, "Angka Pertama 0", Toast.LENGTH_SHORT).show();
                skor = 0;
                angka.text = skor.toString();
            }
        }
        angka.text = skor.toString();



        tambahdua.setOnClickListener {
            skordua = skordua + 1;
            Log.d("SKOR", skordua.toString());
            angkadua.text = skordua.toString();
        }
        kurangdua.setOnClickListener {
            skordua = skordua - 1;
            Log.d("SKOR", skordua.toString());
            angkadua.text = skordua.toString();
            if (checkSkordua(skordua)){
                Toast.makeText(this, "Angka Pertama 0", Toast.LENGTH_SHORT).show();
                skordua = 0;
                angkadua.text = skordua.toString();
            }
        }
        angkadua.text = skordua.toString();
    }


    private fun checkSkor(skor: Int): Boolean {
        return skor < 0;
    }

    private fun checkSkordua(skordua: Int): Boolean {
        return skordua < 0;
    }


}