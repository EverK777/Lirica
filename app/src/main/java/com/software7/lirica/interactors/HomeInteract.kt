package com.software7.lirica.interactors

import com.software7.lirica.interfaces.OnApiPaginationListener
import com.software7.lirica.interfaces.OnApiResponseListener

interface HomeInteract {
    fun setApiResponse(onApiResponseListener:OnApiResponseListener)
    fun setApiNextPage(onApiPaginationListener: OnApiPaginationListener)

}