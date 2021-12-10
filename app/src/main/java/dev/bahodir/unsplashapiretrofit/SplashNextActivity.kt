package dev.bahodir.unsplashapiretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class SplashNextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_next)

        object : CountDownTimer(1500, 100) {
            override fun onTick(p0: Long) {

            }
            override fun onFinish() {
                val intent = Intent(this@SplashNextActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }.start()
    }
}