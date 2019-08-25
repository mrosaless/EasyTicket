package com.easycheck.login

import android.content.Intent
import android.os.Bundle
import com.easycheck.AbstractActivity
import com.easycheck.MainActivity
import com.easycheck.R
import com.easycheck.register.RegisterActivity
import com.easycheck.register.RegisterCodeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        loginRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}