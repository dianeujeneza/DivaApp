package com.moringaschool.divaapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("track.search")
    Call<TrackSearchResponse>getTracks(
            @Query("track_name") String track_name,
            @Query("artist_name") String artist_name,
            @Query("format") String format,
            @Query("callback") String callback,
            @Query("apikey") String api
    );
}
