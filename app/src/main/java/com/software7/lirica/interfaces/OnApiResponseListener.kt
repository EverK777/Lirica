package com.software7.lirica.interfaces

import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.Track
import com.software7.lirica.models.TrackList

interface OnApiResponseListener {
    fun error(errorMessage:String)
    fun success(tracks:ArrayList<TrackList>,lyrics:ArrayList<Lyrics>)
    fun connect()

}