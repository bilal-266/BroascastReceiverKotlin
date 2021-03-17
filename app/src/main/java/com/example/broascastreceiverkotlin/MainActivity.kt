package com.example.broascastreceiverkotlin

import android.content.BroadcastReceiver
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val broadcastReceiver:Button = findViewById(R.id.broadcastBtn)

        broadcastReceiver.setOnClickListener(View.OnClickListener {
            BoradCastReciver()
            val intent = Intent()
            intent.action = Intent.ACTION_GET_CONTENT
            sendBroadcast(intent)
        })
    }
}