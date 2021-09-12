package com.neppplus.jickbbangcopy_210912.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.neppplus.jickbbangcopy_210912.R
import com.neppplus.jickbbangcopy_210912.datas.RoomDatas


class RoomAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<RoomDatas>) : ArrayAdapter<RoomDatas>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if(tempRow == null) {
            tempRow = mInflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        return row
    }


}