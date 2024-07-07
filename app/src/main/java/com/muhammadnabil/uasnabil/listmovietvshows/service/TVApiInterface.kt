package com.muhammadnabil.uasnabil.listmovietvshows.service

import com.muhammadnabil.uasnabil.listmovietvshows.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=53dedfe4c292e7ec524b0b60528da636")
    fun getTVList(): Call<TelevisionResponse>

}