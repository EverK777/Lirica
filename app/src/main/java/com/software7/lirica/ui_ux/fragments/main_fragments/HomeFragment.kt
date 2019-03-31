package com.software7.lirica.ui_ux.fragments.main_fragments

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import com.software7.lirica.R
import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.TrackList
import com.software7.lirica.presenters.HomePresenter
import com.software7.lirica.presenters.HomePresenterImpl
import com.software7.lirica.ui_ux.adapters.HomeAdapter
import com.software7.lirica.views.HomeView
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.LinearLayout
import com.software7.lirica.ui_ux.animations.CircularReveal

class HomeFragment : Fragment(),HomeView{

    private var recyclerHome:RecyclerView ?=null
    private var progressHome:ProgressBar  ?=null
    private var progressPagination:ProgressBar ?=null
    private var containerSearch : LinearLayout? =null
    private var cancelSearch : ImageButton?= null
    private val numColumns = 2
    private var homeAdapter : HomeAdapter ?=null
    private var homePresenter:HomePresenter?=null
    private var tracks : ArrayList<TrackList> = ArrayList()
    private var lyrics : ArrayList<Lyrics> = ArrayList()
    private var loading : Boolean = false



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.home_fragment, container, false)

        recyclerHome = view.findViewById(R.id.homeRecycler)
        progressHome = view.findViewById(R.id.progressHome)
        progressPagination = view.findViewById(R.id.progressPagination)
        containerSearch = view.findViewById(R.id.searchContainer)
        cancelSearch = view.findViewById(R.id.cancelSearch)


        val layoutManager = StaggeredGridLayoutManager(numColumns,LinearLayoutManager.VERTICAL)
        recyclerHome!!.layoutManager = layoutManager

        homePresenter = HomePresenterImpl(this)


        getApiResponse()

        recyclerHome!!.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {

                if(dy>0){
                    val visibleItemCount = layoutManager.childCount
                    val totalItemCount = homeAdapter!!.itemCount
                    val firstVisibleItemPosition = layoutManager.findFirstVisibleItemPositions(null)
                    if(!loading){
                        if(visibleItemCount+firstVisibleItemPosition[0] >= totalItemCount){
                            getNextPage()
                        }
                    }
                }
            }
        })

        cancelSearch!!.setOnClickListener { onSearchFinish() }

        return view
    }


    // methods from the HomeView interface
    override fun onConnectionError(errorMessage:String) {
      Log.d("ERROR_CONNECTION",errorMessage)
      if(progressPagination!!.isShown){
         progressPagination!!.visibility = View.INVISIBLE
      }
        if(progressHome!!.isShown){
           getNextPage()
            progressHome!!.visibility = View.INVISIBLE
        }

        loading = false
    }

    override fun onSuccessResponse(tracks:ArrayList<TrackList>,lyrics:ArrayList<Lyrics>) {
        this.tracks = tracks
        this.lyrics = lyrics
        homeAdapter = HomeAdapter(this.tracks,this.lyrics,context!!)
        recyclerHome!!.adapter = homeAdapter
        progressHome!!.visibility = View.GONE
        recyclerHome!!.visibility = View.VISIBLE
    }

    override fun onStartConnectingToService() {
        progressHome!!.visibility = View.VISIBLE
        homeAdapter = null
        recyclerHome!!.visibility = View.GONE

    }
    override fun onPagination() {
        progressPagination!!.visibility = View.VISIBLE
    }

    override fun onSearchFinish() {
        val circularReveal = CircularReveal(containerSearch!!,containerSearch!!,(activity as AppCompatActivity).supportActionBar!!,context!!)
        circularReveal.closeAnim()
        //hide prgressbar
        if(progressHome!!.isShown){
            progressHome!!.visibility =View.GONE
        }
    }

    //methods from the fragment

    private fun getApiResponse(){
            homePresenter!!.getApiResponse()

    }


    private fun getNextPage(){
        loading = true
        homePresenter!!.getApiNextPage()

    }

    override fun onPaginationSuccess(tracks:ArrayList<TrackList>,lyrics:ArrayList<Lyrics>) {
        for(i in 0 until tracks.size){
            this.tracks.add(tracks[i])
            this.lyrics.add(lyrics[i])
            homeAdapter!!.notifyItemInserted(tracks.size)
        }
        progressPagination!!.visibility = View.GONE
        loading = false
    }


    fun showSearchView(){
            (activity as AppCompatActivity).supportActionBar!!.hide()
            val circularReveal = CircularReveal(containerSearch!!,containerSearch!!,(activity as AppCompatActivity).supportActionBar!!,context!!)
            circularReveal.openAnim()

    }


}