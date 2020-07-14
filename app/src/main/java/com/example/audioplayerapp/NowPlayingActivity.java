package com.example.audioplayerapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.audioplayerapp.Artist;
import com.example.audioplayerapp.MainActivity;
import com.example.audioplayerapp.R;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

        final Position mPosition = (Position) getApplicationContext();

        //SETTING EACH DATA TO NOW PLAYING SCREEN
        ImageView songIcon = findViewById(R.id.iv_song_cover);
        songIcon.setImageResource(mPosition.getmSongIcon());

        TextView songName = findViewById(R.id.tv_song_name);
        songName.setText(mPosition.getmSongName());

        TextView songArtist = findViewById(R.id.tv_song_artist);
        songArtist.setText(mPosition.getmArtistName());

        //SETTING PLAY PAUSE BUTTON
        final Button playButton = findViewById(R.id.bv_play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (playButton.getText().equals("PLAY"))
                    playButton.setText("PAUSE");
                else
                    playButton.setText("PLAY");
            }
        });

        //FOR GETTING DESCRIPTION OF PLAYING SONG
        TextView aboutSong = findViewById(R.id.tv_about_song);
        aboutSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, SongDescription.class);
                startActivity(intent);
            }
        });

        //FOR GOING TO SONGS LIST ACTIVITY
        TextView goToSongList = findViewById(R.id.tv_go_to_songs_list);
        goToSongList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
