package com.software7.lirica.data.interfaces

import com.software7.lirica.models.ResponseLyrics
import com.software7.lirica.models.ResponseTracks
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.*

interface MusicXMatchService {
    //https://musixmatchcom-musixmatch.p.rapidapi.com/wsr/1.1/track.get?track_id=15449912"
    //getTrack
    @GET("track.search")
    fun getTrackMusicXMatchService(@Query("q_lyrics")wordsMatch:String,
                                   @Query("f_lyrics_language")language:String,
                                   @Query("f_has_lyrics")hasLyrics: Int,
                                   @Query("s_track_rating")rating:String,
                                   @Query("page_size")elementsPerPage:Int,
                                   @Query("page")numberOfPages:Int,
                                   @Query("apikey")apiKeY:String): Observable<ResponseTracks>
   //getLyric

    @GET("track.lyrics.get")
    fun getLyricMusicXMarchService(@Query("track_id")trackId:Int,
                                  @Query("apikey")apiKeY:String):Observable<ResponseLyrics>
}
