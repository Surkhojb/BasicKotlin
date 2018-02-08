package com.kt.juanjo.basickotlinapp.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.kt.juanjo.basickotlinapp.R
import com.kt.juanjo.basickotlinapp.model.Quotes
import kotlinx.android.synthetic.main.item_row_quote.view.*

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 08/02/2018.
 */
class QuotesListViewAdapter(private val activity: Activity, moviesList: List<Quotes.QuotesModel>) : BaseAdapter() {

    private var quotes = listOf<Quotes.QuotesModel>()

    init {
        this.quotes = moviesList as ArrayList
    }

    override fun getCount(): Int {
        return quotes.size
    }

    override fun getItem(i: Int): Any {
        return i
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(i: Int, convertView: View?, viewGroup: ViewGroup): View {

        var vi: View?
        val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        vi = inflater.inflate(R.layout.item_row_quote, null)

        vi.item_quote_text.text = quotes[i].quote
        vi.item_quote_author.text = quotes[i].author

        return vi
    }
}