package com.kt.juanjo.basickotlinapp.model

import android.content.Context
import com.google.gson.GsonBuilder
import com.google.gson.annotations.SerializedName

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 08/02/2018.
 */
class Quotes{

        companion object {

            fun getQuotesList(context: Context):  List<QuotesModel>{
                val gson = GsonBuilder().serializeNulls().create()
                val quotesList: List<QuotesModel> = gson.fromJson(readJson(context),
                        Array<QuotesModel>::class.java).toList()

                return quotesList
            }

            private fun readJson(context: Context):String{
                val json_string = context.assets.open("quotes.json")
                        .bufferedReader()
                        .use{
                            it.readText()
                        }

                return json_string
        }
    }

    class QuotesModel {
            @SerializedName("quote")
            var quote: String? = null
            @SerializedName("author")
            var author: String? = null
        }
}