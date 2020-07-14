package com.example.audioplayerapp;

public class Song {
    private int mSongIconResource;
    private String mSongName;
    private String mSongArtist;

    Song(int SongIconResource, String SongName, String SongArtist) {
        mSongIconResource = SongIconResource;
        mSongName = SongName;
        mSongArtist = SongArtist;
    }

    public int getSongIconResource() {
        return mSongIconResource;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getSongArtist() {
        return mSongArtist;
    }
}
