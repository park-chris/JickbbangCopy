package com.neppplus.jickbbangcopy_210912.datas

import java.text.NumberFormat
import java.util.*

class RoomDatas(
    val price: Int,
    val address: String,
    val floor : Int,
    val description: String) {


    fun getFormattedFloor() : String {

//        1. 양수인 경우 (1, 3, 5..) => "floor층"
//        2. 0인 경우 => "반지하"
//        3. 음수인 경우 (-1, -2..) => "지하 ?층"

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

//        1. 1억이 안넘는 경우 ( 가격 < 10000 )
//        2. 그 외 : 1억 이상 => ?억 ???
        if (this.price < 10000) {

//            8000 => "8,000" 으로 변경.
            val formattedStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return formattedStr
        }
        else {

//            75000 => "7억 5,000"
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
