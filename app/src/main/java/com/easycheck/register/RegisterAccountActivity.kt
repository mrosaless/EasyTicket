package com.easycheck.register

import android.os.Bundle
import com.easycheck.AbstractActivity
import com.easycheck.R
import kotlinx.android.synthetic.main.activity_register_account.*

class RegisterAccountActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_account)

        registerAccountInvite.setOnClickListener {  }
        registerAccountNew.setOnClickListener {  }
        registerAccountInvite.setOnClickListener {  }
    }
}
