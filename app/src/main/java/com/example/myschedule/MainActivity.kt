package com.example.myschedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPass: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSign: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtEmail = findViewById(R.id.edt_email)
        edtPass = findViewById(R.id.edt_passs)
        btnLogin = findViewById(R.id.btn_login)
        btnSign = findViewById(R.id.btn_sign)

        btnLogin.setOnClickListener {
            val edtEmail = edt_email.text.toString()
            val edtPass = edt_passs.text.toString()

            val email = intent.getStringArrayExtra("email")
            val password = intent.getStringArrayExtra("password")

            if (edtEmail.isEmpty() || edtPass.isEmpty()) {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if (edtEmail != "f") {
                Toast.makeText(this, "Email salah", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else
                if (edtPass != "1") {
                    Toast.makeText(this, "Password salah", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

            intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("email", email)
            intent.putExtra("password", password)

            intent.putExtra("Email", edtEmail)
            intent.putExtra("Password", edtPass)
            startActivity(intent)
        }

        btnSign.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }
    }
}
