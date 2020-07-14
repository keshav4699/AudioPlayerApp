package com.example.audioplayerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.audioplayerapp.R;
import com.example.audioplayerapp.Song;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(@NonNull Context context, ArrayList<Song> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listSongView = convertView;

        if (listSongView == null) {
            listSongView = LayoutInflater.from(getContext()).inflate(R.layout.song_layout, parent, false);
        }

        Song currentSong = getItem(position);
        assert currentSong != null;

        ImageView iconImageView = listSongView.findViewById(R.id.iv_song_cover);
        iconImageView.setImageResource(currentSong.getSongIconResource());

        TextView nameTextView = listSongView.findViewById(R.id.tv_song_name);
        nameTextView.setText(currentSong.getSongName());

        TextView artistTextView = listSongView.findViewById(R.id.tv_song_artist);
        artistTextView.setText(currentSong.getSongArtist());

        return listSongView;
    }
}
