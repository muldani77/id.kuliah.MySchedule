package com.example.myschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    private lateinit var ibtnAdd: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ibtnAdd = findViewById(R.id.ibtn_add)

        ibtnAdd.setOnClickListener {
            intent = Intent(this, InsertActivity::class.java)
            startActivity(intent)
        }
    }
}
