package com.moringaschool.divaapp;

import android.telecom.Call;

public interface MusixApi {
    @GET("track.search")
    Call<TrackSearchResponse>getTracks(
            @Query("track") String tr
    );
}
