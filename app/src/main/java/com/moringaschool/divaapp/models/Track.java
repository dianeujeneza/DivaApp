
package com.moringaschool.divaapp.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.moringaschool.divaapp.models.PrimaryGenres;
import com.moringaschool.divaapp.models.SecondaryGenres;

public class  Track {

    @SerializedName("instrumental")
    @Expose
    private Integer instrumental;
    @SerializedName("album_coverart_350x350")
    @Expose
    private String albumCoverart350x350;
    @SerializedName("first_release_date")
    @Expose
    private String firstReleaseDate;
    @SerializedName("track_isrc")
    @Expose
    private String trackIsrc;
    @SerializedName("explicit")
    @Expose
    private Integer explicit;
    @SerializedName("track_edit_url")
    @Expose
    private String trackEditUrl;
    @SerializedName("num_favourite")
    @Expose
    private Integer numFavourite;
    @SerializedName("album_coverart_500x500")
    @Expose
    private String albumCoverart500x500;
    @SerializedName("album_name")
    @Expose
    private String albumName;
    @SerializedName("track_rating")
    @Expose
    private Integer trackRating;
    @SerializedName("track_share_url")
    @Expose
    private String trackShareUrl;
    @SerializedName("track_soundcloud_id")
    @Expose
    private Integer trackSoundcloudId;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("album_coverart_800x800")
    @Expose
    private String albumCoverart800x800;
    @SerializedName("album_coverart_100x100")
    @Expose
    private String albumCoverart100x100;
    @SerializedName("track_name_translation_list")
    @Expose
    private List<String> trackNameTranslationList = null;
    @SerializedName("track_name")
    @Expose
    private String trackName;
    @SerializedName("restricted")
    @Expose
    private Integer restricted;
    @SerializedName("has_subtitles")
    @Expose
    private Integer hasSubtitles;
    @SerializedName("updated_time")
    @Expose
    private String updatedTime;
    @SerializedName("subtitle_id")
    @Expose
    private Integer subtitleId;
    @SerializedName("lyrics_id")
    @Expose
    private Integer lyricsId;
    @SerializedName("track_spotify_id")
    @Expose
    private String trackSpotifyId;
    @SerializedName("has_lyrics")
    @Expose
    private Integer hasLyrics;
    @SerializedName("artist_id")
    @Expose
    private Integer artistId;
    @SerializedName("album_id")
    @Expose
    private Integer albumId;
    @SerializedName("artist_mbid")
    @Expose
    private String artistMbid;
    @SerializedName("secondary_genres")
    @Expose
    private SecondaryGenres secondaryGenres;
    @SerializedName("commontrack_vanity_id")
    @Expose
    private String commontrackVanityId;
    @SerializedName("track_id")
    @Expose
    private Integer trackId;
    @SerializedName("track_xboxmusic_id")
    @Expose
    private String trackXboxmusicId;
    @SerializedName("primary_genres")
    @Expose
    private PrimaryGenres primaryGenres;
    @SerializedName("track_length")
    @Expose
    private Integer trackLength;
    @SerializedName("track_mbid")
    @Expose
    private String trackMbid;
    @SerializedName("commontrack_id")
    @Expose
    private Integer commontrackId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param firstReleaseDate
     * @param hasLyrics
     * @param trackXboxmusicId
     * @param artistMbid
     * @param albumCoverart500x500
     * @param trackName
     * @param secondaryGenres
     * @param lyricsId
     * @param artistId
     * @param trackSpotifyId
     * @param trackEditUrl
     * @param albumCoverart800x800
     * @param albumCoverart350x350
     * @param trackNameTranslationList
     * @param updatedTime
     * @param albumCoverart100x100
     * @param trackId
     * @param albumName
     * @param albumId
     * @param restricted
     * @param trackMbid
     * @param trackSoundcloudId
     * @param trackRating
     * @param subtitleId
     * @param trackIsrc
     * @param hasSubtitles
     * @param explicit
     * @param instrumental
     * @param primaryGenres
     * @param commontrackVanityId
     * @param numFavourite
     * @param artistName
     * @param trackShareUrl
     * @param commontrackId
     * @param trackLength
     */
    public Track(Integer instrumental, String albumCoverart350x350, String firstReleaseDate, String trackIsrc, Integer explicit, String trackEditUrl, Integer numFavourite, String albumCoverart500x500, String albumName, Integer trackRating, String trackShareUrl, Integer trackSoundcloudId, String artistName, String albumCoverart800x800, String albumCoverart100x100, List<String> trackNameTranslationList, String trackName, Integer restricted, Integer hasSubtitles, String updatedTime, Integer subtitleId, Integer lyricsId, String trackSpotifyId, Integer hasLyrics, Integer artistId, Integer albumId, String artistMbid, SecondaryGenres secondaryGenres, String commontrackVanityId, Integer trackId, String trackXboxmusicId, PrimaryGenres primaryGenres, Integer trackLength, String trackMbid, Integer commontrackId) {
        super();
        this.instrumental = instrumental;
        this.albumCoverart350x350 = albumCoverart350x350;
        this.firstReleaseDate = firstReleaseDate;
        this.trackIsrc = trackIsrc;
        this.explicit = explicit;
        this.trackEditUrl = trackEditUrl;
        this.numFavourite = numFavourite;
        this.albumCoverart500x500 = albumCoverart500x500;
        this.albumName = albumName;
        this.trackRating = trackRating;
        this.trackShareUrl = trackShareUrl;
        this.trackSoundcloudId = trackSoundcloudId;
        this.artistName = artistName;
        this.albumCoverart800x800 = albumCoverart800x800;
        this.albumCoverart100x100 = albumCoverart100x100;
        this.trackNameTranslationList = trackNameTranslationList;
        this.trackName = trackName;
        this.restricted = restricted;
        this.hasSubtitles = hasSubtitles;
        this.updatedTime = updatedTime;
        this.subtitleId = subtitleId;
        this.lyricsId = lyricsId;
        this.trackSpotifyId = trackSpotifyId;
        this.hasLyrics = hasLyrics;
        this.artistId = artistId;
        this.albumId = albumId;
        this.artistMbid = artistMbid;
        this.secondaryGenres = secondaryGenres;
        this.commontrackVanityId = commontrackVanityId;
        this.trackId = trackId;
        this.trackXboxmusicId = trackXboxmusicId;
        this.primaryGenres = primaryGenres;
        this.trackLength = trackLength;
        this.trackMbid = trackMbid;
        this.commontrackId = commontrackId;
    }

    public Integer getInstrumental() {
        return instrumental;
    }

    public void setInstrumental(Integer instrumental) {
        this.instrumental = instrumental;
    }

    public String getAlbumCoverart350x350() {
        return albumCoverart350x350;
    }

    public void setAlbumCoverart350x350(String albumCoverart350x350) {
        this.albumCoverart350x350 = albumCoverart350x350;
    }

    public String getFirstReleaseDate() {
        return firstReleaseDate;
    }

    public void setFirstReleaseDate(String firstReleaseDate) {
        this.firstReleaseDate = firstReleaseDate;
    }

    public String getTrackIsrc() {
        return trackIsrc;
    }

    public void setTrackIsrc(String trackIsrc) {
        this.trackIsrc = trackIsrc;
    }

    public Integer getExplicit() {
        return explicit;
    }

    public void setExplicit(Integer explicit) {
        this.explicit = explicit;
    }

    public String getTrackEditUrl() {
        return trackEditUrl;
    }

    public void setTrackEditUrl(String trackEditUrl) {
        this.trackEditUrl = trackEditUrl;
    }

    public Integer getNumFavourite() {
        return numFavourite;
    }

    public void setNumFavourite(Integer numFavourite) {
        this.numFavourite = numFavourite;
    }

    public String getAlbumCoverart500x500() {
        return albumCoverart500x500;
    }

    public void setAlbumCoverart500x500(String albumCoverart500x500) {
        this.albumCoverart500x500 = albumCoverart500x500;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Integer getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(Integer trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackShareUrl() {
        return trackShareUrl;
    }

    public void setTrackShareUrl(String trackShareUrl) {
        this.trackShareUrl = trackShareUrl;
    }

    public Integer getTrackSoundcloudId() {
        return trackSoundcloudId;
    }

    public void setTrackSoundcloudId(Integer trackSoundcloudId) {
        this.trackSoundcloudId = trackSoundcloudId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumCoverart800x800() {
        return albumCoverart800x800;
    }

    public void setAlbumCoverart800x800(String albumCoverart800x800) {
        this.albumCoverart800x800 = albumCoverart800x800;
    }

    public String getAlbumCoverart100x100() {
        return albumCoverart100x100;
    }

    public void setAlbumCoverart100x100(String albumCoverart100x100) {
        this.albumCoverart100x100 = albumCoverart100x100;
    }

    public List<String> getTrackNameTranslationList() {
        return trackNameTranslationList;
    }

    public void setTrackNameTranslationList(List<String> trackNameTranslationList) {
        this.trackNameTranslationList = trackNameTranslationList;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Integer getRestricted() {
        return restricted;
    }

    public void setRestricted(Integer restricted) {
        this.restricted = restricted;
    }

    public Integer getHasSubtitles() {
        return hasSubtitles;
    }

    public void setHasSubtitles(Integer hasSubtitles) {
        this.hasSubtitles = hasSubtitles;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getSubtitleId() {
        return subtitleId;
    }

    public void setSubtitleId(Integer subtitleId) {
        this.subtitleId = subtitleId;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(Integer lyricsId) {
        this.lyricsId = lyricsId;
    }

    public String getTrackSpotifyId() {
        return trackSpotifyId;
    }

    public void setTrackSpotifyId(String trackSpotifyId) {
        this.trackSpotifyId = trackSpotifyId;
    }

    public Integer getHasLyrics() {
        return hasLyrics;
    }

    public void setHasLyrics(Integer hasLyrics) {
        this.hasLyrics = hasLyrics;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getArtistMbid() {
        return artistMbid;
    }

    public void setArtistMbid(String artistMbid) {
        this.artistMbid = artistMbid;
    }

    public SecondaryGenres getSecondaryGenres() {
        return secondaryGenres;
    }

    public void setSecondaryGenres(SecondaryGenres secondaryGenres) {
        this.secondaryGenres = secondaryGenres;
    }

    public String getCommontrackVanityId() {
        return commontrackVanityId;
    }

    public void setCommontrackVanityId(String commontrackVanityId) {
        this.commontrackVanityId = commontrackVanityId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackXboxmusicId() {
        return trackXboxmusicId;
    }

    public void setTrackXboxmusicId(String trackXboxmusicId) {
        this.trackXboxmusicId = trackXboxmusicId;
    }

    public PrimaryGenres getPrimaryGenres() {
        return primaryGenres;
    }

    public void setPrimaryGenres(PrimaryGenres primaryGenres) {
        this.primaryGenres = primaryGenres;
    }

    public Integer getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Integer trackLength) {
        this.trackLength = trackLength;
    }

    public String getTrackMbid() {
        return trackMbid;
    }

    public void setTrackMbid(String trackMbid) {
        this.trackMbid = trackMbid;
    }

    public Integer getCommontrackId() {
        return commontrackId;
    }

    public void setCommontrackId(Integer commontrackId) {
        this.commontrackId = commontrackId;
    }

}
