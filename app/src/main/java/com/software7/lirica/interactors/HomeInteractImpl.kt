package com.software7.lirica.interactors

import android.annotation.SuppressLint
import android.database.Observable
import android.util.Log
import com.software7.lirica.Lyrica
import com.software7.lirica.data.interfaces.MusicXMatchService
import com.software7.lirica.interfaces.OnApiPaginationListener
import com.software7.lirica.interfaces.OnApiResponseListener
import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.ResponseTracks
import com.software7.lirica.models.TrackList
import io.reactivex.ObservableSource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class HomeInteractImpl:HomeInteract {

    private var retrofit : Retrofit?=null
    private var musicXMatchService:MusicXMatchService?=null
    private var lyrics : ArrayList<Lyrics> = ArrayList()
    private var tracks : ArrayList<TrackList> = ArrayList()
    private val apiKey = "1a2573ac430165e116d4f53ed1c5cf9d"
    private val keyWords: Array<String> = arrayOf("Love","Hate","Passion","peace","hope","Happy","sad","sadness","Happiness," +
            "pain","couple","vain","madness","heartbreak","beautiful","kiss","hearth","ocean","baby","travel","miss you","leave","pain","sorrow")

    init {
        retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.musixmatch.com/ws/1.1/")
            .build()

        musicXMatchService = retrofit!!.create(MusicXMatchService::class.java)
    }

    @SuppressLint("CheckResult")
    override fun setApiResponse(onApiResponseListener: OnApiResponseListener) {
        onApiResponseListener.connect()


        val getTrack: io.reactivex.Observable<ResponseTracks> =
            musicXMatchService!!.getTrackMusicXMatchService( getKeyWordSearch(),"en",0,"desc",Lyrica.numberOfElementsPerPageHome, 1, apiKey)
             getTrack.flatMapIterable { response -> response.message.body.track_list }
                 .doOnNext { trackList->
                     if(trackList.track.track_name.contains("(")){
                         trackList.track.track_name = trackList.track.track_name.substringBefore("(")
                     }else if(trackList.track.track_name.contains("-")){
                         trackList.track.track_name = trackList.track.track_name.substringBefore("-")
                     }
                     tracks.add(trackList) }
                 .flatMap {track-> musicXMatchService!!.getLyricMusicXMarchService(track.track.track_id,apiKey)}
                 .subscribeOn(Schedulers.io())
                 .observeOn(AndroidSchedulers.mainThread())
                 .subscribe(
                     {lyricsResponse-> lyrics.add(lyricsResponse.message.body.lyrics)},
                     { error -> onApiResponseListener.error(error.message.toString())},
                     { if(tracks.size == lyrics.size){
                         onApiResponseListener.success(tracks,lyrics)
                     }else{onApiResponseListener.error(tracks.size.toString() + ":"+lyrics.size.toString()) }
                     })


    }
    @SuppressLint("CheckResult")
    override fun setApiNextPage(onApiPaginationListener: OnApiPaginationListener) {
        onApiPaginationListener.startPagination()
        val getTrack: io.reactivex.Observable<ResponseTracks> =
            musicXMatchService!!.getTrackMusicXMatchService( getKeyWordSearch(),"en",0,"desc",Lyrica.numberOfElementsPerPageHome, 1, apiKey)
        getTrack.flatMapIterable { response -> response.message.body.track_list }
            .doOnNext { trackList->
                if(trackList.track.track_name.contains("(")){
                    trackList.track.track_name = trackList.track.track_name.substringBefore("(")
                }else if(trackList.track.track_name.contains("-")){
                    trackList.track.track_name = trackList.track.track_name.substringBefore("-")
                }
                tracks.add(trackList) }
            .flatMap {track-> musicXMatchService!!.getLyricMusicXMarchService(track.track.track_id,apiKey)}
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {lyricsResponse-> lyrics.add(lyricsResponse.message.body.lyrics)},
                { error -> onApiPaginationListener.errorNextPage(error.message.toString())},
                {if(tracks.size == lyrics.size){
                    onApiPaginationListener.successPagination(tracks,lyrics)}else{
                    onApiPaginationListener.errorNextPage(tracks.size.toString() + ":"+lyrics.size.toString())}})
    }

    private fun getKeyWordSearch():String{
        fun IntRange.random() = Random().nextInt((endInclusive + 1) - start) + start
        val randomNumber = (0..(keyWords.size-1)).random()

        return keyWords[randomNumber]
    }
}
