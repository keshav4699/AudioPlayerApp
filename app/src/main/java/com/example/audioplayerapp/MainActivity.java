package com.example.audioplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.audioplayerapp.R;
import com.example.audioplayerapp.Song;
import com.example.audioplayerapp.SongAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //globally declaring position variable
        final Position mPosition = (Position) getApplicationContext();
        mPosition.setPosition(0);

        //SONG DATA
        final ArrayList<Song> songArrayList = new ArrayList<>();

        songArrayList.add(new Song(R.drawable.brunomars, "Just the Way You Are", "Bruno Mars"));
        songArrayList.add(new Song(R.drawable.reputation, "Gorgeous", "Taylor Swift"));
        songArrayList.add(new Song(R.drawable.brunomars, "Billionaire", "Bruno Mars"));
        songArrayList.add(new Song(R.drawable.mokingbird, "Mokingbird", "Eminem"));
        songArrayList.add(new Song(R.drawable.reputation, "Delicate", "Taylor Swift"));
        songArrayList.add(new Song(R.drawable.seeyouagain, "See You Again", "Wiz Khalifa, Charlie Puth"));
        songArrayList.add(new Song(R.drawable.perfect, "Shape of You", "Ed Sheeran"));
        songArrayList.add(new Song(R.drawable.perfect, "Perfect", "Ed Sheeran"));
        songArrayList.add(new Song(R.drawable.lovethewayyoulie, "Love the Way YOu Lie", "Eminem"));
        songArrayList.add(new Song(R.drawable.justinbeiberpurpose, "Love Yourself", "Justin Bieber"));
        songArrayList.add(new Song(R.drawable.charlieputh, "Attention", "Charlie Puth"));
        songArrayList.add(new Song(R.drawable.justinbeiberpurpose, "Sorry", "Justin Bieber"));
        songArrayList.add(new Song(R.drawable.perfect, "Eraser", "Ed Sheeran"));
        songArrayList.add(new Song(R.drawable.brunomars, "24K Magic", "Bruno Mars"));
        songArrayList.add(new Song(R.drawable.reputation, "Call it what you want", "Taylor Swift"));
        songArrayList.add(new Song(R.drawable.charlieputh, "Attention", "Charlie Puth"));

        //SETTING LIST VIEW IN MAIN ACTIVITY
        SongAdapter itemsAdapter = new SongAdapter(this, songArrayList);

        ListView listView = findViewById(R.id.lv_song_list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mPosition.setPosition(position);
                mPosition.setmSongIcon(songArrayList.get(position).getSongIconResource());
                mPosition.setmSongName(songArrayList.get(position).getSongName());
                mPosition.setmArtistName(songArrayList.get(position).getSongArtist());
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        TextView goToNowPlaying = findViewById(R.id.tv_go_to_now_playing);
        goToNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}