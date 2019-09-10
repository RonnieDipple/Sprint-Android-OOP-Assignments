package com.example.inheritanceassignment.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritanceassignment.viewmodel.Adapter
import com.example.inheritanceassignment.model.ShoppingItem
import com.example.inheritanceassignment.model.TeaList
import com.example.testing.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter =
                Adapter(TeaList)
        }

        //Adds items to the TeaList
        TeaList.add(
            ShoppingItem.Tea(
                R.color.tea,
                "British Breakfast",
                true
            )
        )
        TeaList.add(
            ShoppingItem.Sugar(
                R.color.sugar,
                "Granny's white sugar",
                3
            )
        )
        TeaList.add(
            ShoppingItem.GotMilk(
                R.color.milk,
                "Cows Milk",
                true
            )
        )
        TeaList.add(
            ShoppingItem(
                R.color.colorPrimaryDark,
                "test product"
            )
        )


    }

    //OLD METHOD

   /*  object generateTestValues : ArrayList<ShoppingItem>(
         arrayListOf(
             ShoppingItem.Tea(
                 productName = "English Breakfast Tea",
                 British = true,
                 colorId = 0

             ),
             ShoppingItem.Sugar(
                 productName = "White sugar",
                 bagsOfSugar = 2,
                 colorId = 1

             ),
             ShoppingItem.GotMilk(
                 productName = "Cow's Milk is the best",
                 cowsMilkBool = true,
                 colorId = 3

             )


         )
     )*/





}
