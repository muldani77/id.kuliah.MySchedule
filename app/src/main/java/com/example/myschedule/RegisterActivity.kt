package com.example.myschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var edtDepan: EditText
    private lateinit var edtBelakang: EditText
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSign: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        edtDepan = findViewById(R.id.edt_depan)
        edtBelakang = findViewById(R.id.edt_belakang)
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_pass)
        btnSign = findViewById(R.id.btn_sign)

        btn_sign.setOnClickListener {
            Toast.makeText(this, "Sign In Berhasil", Toast.LENGTH_LONG).show()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        }
    }

