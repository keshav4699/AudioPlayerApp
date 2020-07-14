package com.example.audioplayerapp;

public class Artist {
    private String mArtistName;
    private String mArtistDescription;

    Artist(String ArtistName, String ArtistDescription) {
        mArtistName = ArtistName;
        mArtistDescription = ArtistDescription;
    }

    public String getArtistDescription() {
        return mArtistDescription;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
