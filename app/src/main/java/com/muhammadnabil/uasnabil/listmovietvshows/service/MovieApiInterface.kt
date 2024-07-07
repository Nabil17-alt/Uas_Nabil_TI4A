package com.muhammadnabil.uasnabil.listmovietvshows.service

import com.muhammadnabil.uasnabil.listmovietvshows.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=53dedfe4c292e7ec524b0b60528da636")
    fun getMovieList(): Call<MovieResponse>

}