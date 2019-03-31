package com.software7.lirica.views

import android.content.Context
import android.widget.ImageView
import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.Track
import com.software7.lirica.models.TrackList

interface HomeView {
    fun onConnectionError(errorMessage:String)
    fun onSuccessResponse(tracks:ArrayList<TrackList>,lyrics:ArrayList<Lyrics>)
    fun onStartConnectingToService()
    fun onPagination()
    fun onPaginationSuccess(tracks:ArrayList<TrackList>,lyrics:ArrayList<Lyrics>)
    fun onSearchFinish()



}