package com.neppplus.jickbbangcopy_210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbbangcopy_210912.datas.RoomDatas
import kotlinx.android.synthetic.main.activity_inner.*

class InnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner)

        val room = intent.getSerializableExtra("roomData") as RoomDatas

        priTxt.text = room.getFormatTedPrice()
        descTxt.text = room.description
        addressTxt.text = room.address
        floorTxt.text = room.getFormattedFloor()


    }
}