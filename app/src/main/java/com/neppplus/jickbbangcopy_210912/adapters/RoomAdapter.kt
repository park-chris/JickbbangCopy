package com.neppplus.jickbbangcopy_210912.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)


        priceTxt.text = data.getFormatTedPrice()

        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"

        descriptionTxt.text = data.description

        return row
    }


}