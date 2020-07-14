package com.example.audioplayerapp;

import android.app.Application;

public class Position extends Application {
    private int Position;
    private String mSongName;
    private String mArtistName;
    private int mSongIcon;

    public void setmSongIcon(int mSongIcon) {
        this.mSongIcon = mSongIcon;
    }

    public int getmSongIcon() {
        return mSongIcon;
    }

    public void setPosition(int position) {
        Position = position;
    }

    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public int getPosition() {
        return Position;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }
}
