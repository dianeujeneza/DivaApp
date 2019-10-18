
package com.moringaschool.divaapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrimaryGenres {

    @SerializedName("music_genre_list")
    @Expose
    private List<MusicGenreList_> musicGenreList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrimaryGenres() {
    }

    /**
     * 
     * @param musicGenreList
     */
    public PrimaryGenres(List<MusicGenreList_> musicGenreList) {
        super();
        this.musicGenreList = musicGenreList;
    }

    public List<MusicGenreList_> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenreList_> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
