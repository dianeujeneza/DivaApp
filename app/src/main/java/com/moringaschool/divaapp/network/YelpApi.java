package com.moringaschool.divaapp.network;

import com.moringaschool.divaapp.YelpBusinessSearchResponse;
//import com.moringaschool.divaapp.models.Body;
//import com.moringaschool.divaapp.models.Track;
//import com.moringaschool.divaapp.models.TrackList;
//import com.moringaschool.divaapp.models.TrackSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("businesses/search")
    Call<YelpBusinessSearchResponse> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );
}
