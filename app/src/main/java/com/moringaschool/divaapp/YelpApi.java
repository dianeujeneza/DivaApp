package com.moringaschool.divaapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("track.search")
    Call<TrackSearchResponse>getTrackName(
            @Query("trackName") String trackName,
            @Query("term") String term
    );
}
