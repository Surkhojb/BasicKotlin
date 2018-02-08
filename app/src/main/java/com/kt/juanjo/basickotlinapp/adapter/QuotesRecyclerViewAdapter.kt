package com.kt.juanjo.basickotlinapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.kt.juanjo.basickotlinapp.R
import com.kt.juanjo.basickotlinapp.model.Quotes
import com.kt.juanjo.basickotlinapp.utils.inflate
import kotlinx.android.synthetic.main.item_row_quote.view.*


/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 08/02/2018.
 */

class QuotesRecyclerViewAdapter : RecyclerView.Adapter<QuotesRecyclerViewAdapter.ViewHolder>() {

    var quotes : List<Quotes.QuotesModel> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = parent.inflate(R.layout.item_row_quote, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = quotes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(quotes.get(position))
    }

    fun setData(list:List<Quotes.QuotesModel>){
        quotes = list
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: Quotes.QuotesModel){
            itemView.item_quote_text.text = item.quote
            itemView.item_quote_author.text = item.author
        }
    }
}