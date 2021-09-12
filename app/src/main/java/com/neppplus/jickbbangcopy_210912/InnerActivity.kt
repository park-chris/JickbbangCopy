package com.neppplus.jickbbangcopy_210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbbangcopy_210912.datas.RoomDatas

class InnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner)

        val room = intent.getSerializableExtra("roomData") as RoomDatas





    }
}