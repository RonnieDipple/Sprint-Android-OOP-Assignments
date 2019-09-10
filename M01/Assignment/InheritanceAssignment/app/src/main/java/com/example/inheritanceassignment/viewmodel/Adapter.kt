package com.example.inheritanceassignment.viewmodel


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritanceassignment.model.ShoppingItem
import com.example.testing.R
import kotlinx.android.synthetic.main.activity_items_list.view.*

class Adapter(val teaList: MutableList<ShoppingItem>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
/*
* gets receiptsList and displays in views
*
* */


    // instantiates views
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val card: CardView = view.card_view
        val textViewName: TextView = view.tv_name


        //Bind view to Model

        fun bindModel(testItems: ShoppingItem) {
            textViewName.text = testItems.productName


        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(

            //Inflates layout
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_items_list, parent, false) as View


        )


    }

    override fun getItemCount() = teaList.size

    override fun onBindViewHolder(ViewHolder: ViewHolder, position: Int) {

        val item = teaList[position]
        ViewHolder.textViewName.text = item.productName
        ViewHolder.card.background =
            ContextCompat.getDrawable(ViewHolder.card.context, item.colorId) //Changes the card color
        ViewHolder.bindModel(item)


    }

}


