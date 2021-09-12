package com.neppplus.jickbbangcopy_210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbbangcopy_210912.adapters.RoomAdapter
import com.neppplus.jickbbangcopy_210912.datas.RoomDatas
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomDatas>()

    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomDatas(8000, "서울시 성동구", 3, "1번째 방입니다."))
        mRoomList.add(RoomDatas(9000, "서울시 성북구", 0, "2번째 방입니다."))
        mRoomList.add(RoomDatas(10000, "서울시 강남구", -1, "3번째 방입니다."))
        mRoomList.add(RoomDatas(11000, "서울시 관악구", 5, "4번째 방입니다."))
        mRoomList.add(RoomDatas(12000, "서울시 강서구", 1, "5번째 방입니다."))
        mRoomList.add(RoomDatas(20000, "서울시 강남구", -1, "6번째 방입니다."))
        mRoomList.add(RoomDatas(21000, "서울시 관악구", 0, "7번째 방입니다."))
        mRoomList.add(RoomDatas(32000, "서울시 강서구", 1, "8번째 방입니다."))


        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)

        roomListView.adapter = mRoomAdapter


    }
}