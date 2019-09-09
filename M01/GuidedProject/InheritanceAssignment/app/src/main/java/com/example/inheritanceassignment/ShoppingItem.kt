package com.example.inheritanceassignment

open class ShoppingItem(val colorId: Int, val productName: String) {

    fun getDisplayName(): String {
        return productName
    }
}

class tea(colorId: Int, val British: Boolean)

class sugar(colorId: Int, val bagsOfSugar: Int)

class gotMilk(colorId: Int, val cowsMilk: Boolean)

