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


//        양수 / 0 층 / -층에 따라 다른 층수로 가공.

        if (this.floor > 0) {
            
//            양수일때 : ?층 형태로 가공
            
            return "${this.floor}층"
        }
        else if (this.floor == 0 ){
            
//            0층 : 반지하로 가공
            
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
