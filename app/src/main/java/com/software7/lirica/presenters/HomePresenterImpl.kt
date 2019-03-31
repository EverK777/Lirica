package com.software7.lirica.presenters

import com.software7.lirica.interactors.HomeInteract
import com.software7.lirica.interactors.HomeInteractImpl
import com.software7.lirica.interfaces.OnApiPaginationListener
import com.software7.lirica.interfaces.OnApiResponseListener
import com.software7.lirica.models.Lyrics
import com.software7.lirica.models.TrackList
import com.software7.lirica.views.HomeView

class HomePresenterImpl(var homeView: HomeView):HomePresenter,OnApiResponseListener,OnApiPaginationListener {

    private var homeInteract:HomeInteract ? = null

    init{
        homeInteract = HomeInteractImpl()
    }

    //HomePresenterMethods
    override fun getApiResponse() {
      homeInteract!!.setApiResponse(this)

    }
    override fun getApiNextPage() {
       homeInteract!!.setApiNextPage(this)
    }

    // OnResponseListenerMethods
    override fun error(errorMessage:String) {
        homeView.onConnectionError(errorMessage)

    }

    override fun success(tracks: ArrayList<TrackList>,lyrics:ArrayList<Lyrics>) {
        homeView.onSuccessResponse(tracks,lyrics)
    }

    override fun connect() {
        homeView.onStartConnectingToService()

    }
    override fun successPagination(tracks: ArrayList<TrackList>,lyrics:ArrayList<Lyrics>) {
        homeView.onPaginationSuccess(tracks,lyrics)
    }
    override fun startPagination() {
        homeView.onPagination()
    }
    override fun errorNextPage(message: String) {
        homeView.onConnectionError(message)
    }
}