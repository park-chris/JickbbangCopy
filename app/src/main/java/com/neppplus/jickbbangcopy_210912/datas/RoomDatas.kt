package com.neppplus.jickbbangcopy_210912.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomDatas(
    val price: Int,
    val address: String,
    val floor : Int,
    val description: String) : Serializable {


    fun getFormattedFloor() : String {


        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor == 0 ){
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }


    }


    fun getFormatTedPrice() : String {

        if (this.price < 10000) {

            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return formattedStr
        }
        else {

            val bilion = this.price / 10000
            val rest = this.price % 10000

            val restCoomaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            if (rest == 0) {
                val formattedStr = "${bilion}억"

                return formattedStr
            }
            else {
                val formattedStr = "${bilion}억 ${restCoomaStr}"

                return formattedStr
            }


        }
    }

}
