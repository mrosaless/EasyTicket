package com.easycheck.register

import android.content.Intent
import android.os.Bundle
import com.easycheck.AbstractActivity
import com.easycheck.R
import kotlinx.android.synthetic.main.activity_register_code_full.*

class RegisterCodeFullActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_code_full)

        registerCodeFullBtn.setOnClickListener {
            startActivity(Intent(this, RegisterAccountActivity::class.java))
        }
    }
}
