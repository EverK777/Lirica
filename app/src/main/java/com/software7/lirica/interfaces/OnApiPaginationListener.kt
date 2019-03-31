package com.software7.lirica.interfaces

import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.TrackList

interface OnApiPaginationListener {
    fun successPagination(tracks: ArrayList<TrackList>, lyrics:ArrayList<Lyrics>)
    fun startPagination()
    fun errorNextPage(message:String)
}