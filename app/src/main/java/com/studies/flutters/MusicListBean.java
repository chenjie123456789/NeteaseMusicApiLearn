package com.studies.flutters;

public class MusicListBean {
    private String music_tile;
    private String music_artist;
    private String music_list_number;
    private String music_url;

    public String getMusic_artist() {
        return music_artist;
    }

    public String getMusic_tile() {
        return music_tile;
    }

    public void setMusic_artist(String music_artist) {
        this.music_artist = music_artist;
    }

    public void setMusic_tile(String music_tile) {
        this.music_tile = music_tile;
    }

    public void setMusic_url(String music_url) {
        this.music_url = music_url;
    }

    public String getMusic_url() {
        return music_url;
    }
}
