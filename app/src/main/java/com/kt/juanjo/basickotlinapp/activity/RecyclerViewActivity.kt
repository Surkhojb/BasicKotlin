package com.kt.juanjo.basickotlinapp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.kt.juanjo.basickotlinapp.R
import com.kt.juanjo.basickotlinapp.adapter.QuotesRecyclerViewAdapter
import com.kt.juanjo.basickotlinapp.model.Quotes
import kotlinx.android.synthetic.main.activity_recyclerview.*

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 08/02/2018.
 */
class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val quotesList: List<Quotes.QuotesModel> = Quotes.getQuotesList(applicationContext)

        val quotesAdapter = QuotesRecyclerViewAdapter()
        quotesAdapter.setData(quotesList)

        rv_list_quotes.layoutManager = LinearLayoutManager(this)
        rv_list_quotes.adapter = quotesAdapter

    }


}