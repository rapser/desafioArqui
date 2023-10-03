package com.rapser.desafioarquitecturas

import retrofit2.http.GET

interface MoviesService {
    @GET("discover/movie?api_key=60ea4d073f7eca298c191fcc89bc2c92")
    suspend fun getMovies(): MovieResult
}

