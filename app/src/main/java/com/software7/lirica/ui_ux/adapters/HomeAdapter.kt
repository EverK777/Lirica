package com.software7.lirica.ui_ux.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.software7.lirica.R
import com.software7.lirica.data.internal.BackgroundsResources
import com.software7.lirica.interfaces.OnItemClickListener
import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.TrackList
import com.software7.lirica.ui_ux.adapters.view_holders.HomeViewHolder
import com.squareup.picasso.Picasso
import java.util.*
import kotlin.collections.ArrayList

class HomeAdapter(var tracks:ArrayList<TrackList>,var lyrics:ArrayList<Lyrics>, context : Context): RecyclerView.Adapter<HomeViewHolder>() {
    private var mListener : OnItemClickListener ?= null
    private var backgroundResources: BackgroundsResources ? = null

    init{
        backgroundResources = BackgroundsResources(context)
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): HomeViewHolder {
     val view =LayoutInflater.from(p0.context).inflate(R.layout.home_recycler_model,p0,false)

     return HomeViewHolder(view)
    }

    override fun getItemCount(): Int {
      return lyrics.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, index: Int) {
        val track = tracks[index].track
        val lyric = lyrics[index]
        var lyricBody = lyric.lyrics_body


        if(lyricBody.length > 100){
            lyricBody = lyricBody.substring(0,96) + "..."
        }

        Picasso.get()
            .load(getBackgroundImage())
            .resize(250, 250)
            .centerCrop()
            .into(holder.background)
        holder.artist.text = track.artist_name
        holder.tvTittleSong.text = track.track_name
        holder.lyric.text = lyricBody

    }

    private fun getBackgroundImage():Int{

       return backgroundResources!!.getBackgroundImg()
    }

    private fun setOnItemClickListener(onItemClickListener: OnItemClickListener){
            mListener =onItemClickListener

    }
}