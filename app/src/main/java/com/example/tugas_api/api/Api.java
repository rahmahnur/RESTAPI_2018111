package com.example.tugas_api.api;

import com.example.tugas_api.model.SportList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
  @GET("all_sports.php")
  Call<SportList> getSportList(@Query("c") String c);
}
