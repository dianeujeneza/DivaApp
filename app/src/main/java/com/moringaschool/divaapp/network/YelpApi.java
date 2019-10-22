package com.moringaschool.divaapp.network;

import com.moringaschool.divaapp.models.Body;
import com.moringaschool.divaapp.models.Track;
import com.moringaschool.divaapp.models.TrackList;
import com.moringaschool.divaapp.models.TrackSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("track.search")
    Call<TrackList>getTracks(
//            @Query("track_name") String track_name
//            @Query("artist_name") String artist_name,
//            @Query("format") String format,
//            @Query("callback") String callback,
//            @Query("apikey") String api,
            @Query("q_track") String q_track
//            @Query("q_artist") String q_artist,
//            @Query("q_lyrics") String q_lyrics
//            @Query("s_track_rating") double s_track_rating
    );
}
