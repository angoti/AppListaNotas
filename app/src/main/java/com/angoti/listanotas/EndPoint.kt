package com.angoti.listanotas

import retrofit2.Call
import retrofit2.http.GET

interface EndPoint {

    @GET("notas")
    fun getNotas():Call<List<Notas>>
}