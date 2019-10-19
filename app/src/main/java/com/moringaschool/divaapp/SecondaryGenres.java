
package com.moringaschool.divaapp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondaryGenres {

    @SerializedName("music_genre_list")
    @Expose
    private List<MusicGenreList> musicGenreList = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SecondaryGenres() {
    }

    /**
     * 
     * @param musicGenreList
     */
    public SecondaryGenres(List<MusicGenreList> musicGenreList) {
        super();
        this.musicGenreList = musicGenreList;
    }

    public List<MusicGenreList> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenreList> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

}
