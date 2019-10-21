
package com.moringaschool.divaapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicGenre_ {

    @SerializedName("music_genre_vanity")
    @Expose
    private String musicGenreVanity;
    @SerializedName("music_genre_name_extended")
    @Expose
    private String musicGenreNameExtended;
    @SerializedName("music_genre_name")
    @Expose
    private String musicGenreName;
    @SerializedName("music_genre_parent_id")
    @Expose
    private Integer musicGenreParentId;
    @SerializedName("music_genre_id")
    @Expose
    private Integer musicGenreId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MusicGenre_() {
    }

    /**
     * 
     * @param musicGenreName
     * @param musicGenreId
     * @param musicGenreNameExtended
     * @param musicGenreVanity
     * @param musicGenreParentId
     */
    public MusicGenre_(String musicGenreVanity, String musicGenreNameExtended, String musicGenreName, Integer musicGenreParentId, Integer musicGenreId) {
        super();
        this.musicGenreVanity = musicGenreVanity;
        this.musicGenreNameExtended = musicGenreNameExtended;
        this.musicGenreName = musicGenreName;
        this.musicGenreParentId = musicGenreParentId;
        this.musicGenreId = musicGenreId;
    }

    public String getMusicGenreVanity() {
        return musicGenreVanity;
    }

    public void setMusicGenreVanity(String musicGenreVanity) {
        this.musicGenreVanity = musicGenreVanity;
    }

    public String getMusicGenreNameExtended() {
        return musicGenreNameExtended;
    }

    public void setMusicGenreNameExtended(String musicGenreNameExtended) {
        this.musicGenreNameExtended = musicGenreNameExtended;
    }

    public String getMusicGenreName() {
        return musicGenreName;
    }

    public void setMusicGenreName(String musicGenreName) {
        this.musicGenreName = musicGenreName;
    }

    public Integer getMusicGenreParentId() {
        return musicGenreParentId;
    }

    public void setMusicGenreParentId(Integer musicGenreParentId) {
        this.musicGenreParentId = musicGenreParentId;
    }

    public Integer getMusicGenreId() {
        return musicGenreId;
    }

    public void setMusicGenreId(Integer musicGenreId) {
        this.musicGenreId = musicGenreId;
    }

}
