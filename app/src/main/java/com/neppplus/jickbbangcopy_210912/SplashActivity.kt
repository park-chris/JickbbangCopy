package com.neppplus.jickbbangcopy_210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myIntent = Intent(this, MainActivity::class.java)

//        3초 뒤에 -> 화면 전환 코드 실행 시키고 싶다.
//        코드 실행을 3초 지연시키는 방법?


        startActivity(myIntent)
        finish()
    }
}