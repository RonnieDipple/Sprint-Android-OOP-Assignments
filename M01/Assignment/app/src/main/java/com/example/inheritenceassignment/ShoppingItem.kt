package com.example.inheritenceassignment

open class ShoppingItem(val colorId: Int, val productName: String) {

    fun getDisplayName(): String{
        return productName
    }

    class tea (colorId: Int, val cowsMilk: Boolean)

    class gotMilk(colorId: Int, val cowsMilk: Boolean)


}