package com.software7.lirica.ui_ux.adapters.view_holders

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.software7.lirica.R


class HomeViewHolder(itemView: View ) : RecyclerView.ViewHolder(itemView) {

        val background    = itemView.findViewById<ImageView>(R.id.backGround)!!
        val tvTittleSong  = itemView.findViewById<TextView>(R.id.TVtittleSong)!!
        val artist        = itemView.findViewById<TextView>(R.id.TVArtist)!!
        val lyric         = itemView.findViewById<TextView>(R.id.TVLyricContainer)!!


}