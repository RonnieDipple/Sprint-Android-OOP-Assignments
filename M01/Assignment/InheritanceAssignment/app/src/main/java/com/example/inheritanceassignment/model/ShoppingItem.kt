package com.example.inheritanceassignment.model

import android.util.Log
import com.example.testing.R

open class ShoppingItem(val colorId: Int, val productName: String) {


    protected open fun getDisplayName(): String {
        return productName
    }

    open class Tea(colorId: Int = R.color.tea, productName: String, val British: Boolean) :
        ShoppingItem(colorId, productName) {
        fun doTea() {
            Log.i("Tea", "Doing the Tea")
        }

        override fun getDisplayName(): String {
            return "Is ${productName} a British product ${British} "
        }
    }

    open class Sugar(colorId: Int = R.color.sugar, productName: String, val bagsOfSugar: Int) :
        ShoppingItem(colorId, productName) {
        fun addingSugar() {
            Log.i("Sugar", "Adding Sugar")
        }

        override fun getDisplayName(): String {
            return "how many ${productName} bags do we have? ${bagsOfSugar} "
        }
    }

    open class GotMilk(colorId: Int = R.color.milk, productName: String, val cowsMilkBool: Boolean) :
        ShoppingItem(colorId, productName) {
        fun addingMilk() {
            Log.i("Milk", "Adding Milk")
        }

        override fun getDisplayName(): String {
            return "Do we have any bottles of ${productName}? ${cowsMilkBool} "
        }
    }

   /* object generateTestValues : ArrayList<ShoppingItem>(
        arrayListOf(
            Tea(
                productName = "English Breakfast Tea",
                British = true,
                colorId = 0

            ),
            Sugar(
                productName = "White sugar",
                bagsOfSugar = 2,
                colorId = 1

            ),
            GotMilk(
                productName = "Cow's Milk is the best",
                cowsMilkBool = true,
                colorId = 3

            )


        )
    )*/


}









