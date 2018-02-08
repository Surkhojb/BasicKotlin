package com.kt.juanjo.basickotlinapp.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kt.juanjo.basickotlinapp.R
import com.kt.juanjo.basickotlinapp.adapter.QuotesListViewAdapter
import com.kt.juanjo.basickotlinapp.model.Quotes
import kotlinx.android.synthetic.main.activity_listview.*

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 08/02/2018.
 */
class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val quotesList: List<Quotes.QuotesModel> = Quotes.getQuotesList(applicationContext)
        val quotesAdapter = QuotesListViewAdapter(this,quotesList)

        lv_quotes.adapter = quotesAdapter

    }


}
