package com.easycheck.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.easycheck.AbstractActivity
import com.easycheck.R
import com.easycheck.login.LoginActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AbstractActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Glide.with(this)
            .load(R.drawable.logo)
            .apply(RequestOptions.circleCropTransform())
            .into(splashLogo);

        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 2000)
    }
}