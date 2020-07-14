package com.example.audioplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongDescription extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_description);

        final Position mPosition = (Position) getApplicationContext();

        //ARTIST DATA
        final ArrayList<Artist> artistArrayList = new ArrayList<>();
        artistArrayList.add(new Artist("Bruno Mars", getString(R.string.about_bruno_mars)));
        artistArrayList.add(new Artist("Eminem", getString(R.string.about_eminem)));
        artistArrayList.add(new Artist("Taylor Swift", getString(R.string.about_taylor_swift)));
        artistArrayList.add(new Artist("Charlie Puth", getString(R.string.about_charlie_puth)));
        artistArrayList.add(new Artist("Justin Bieber", getString(R.string.about_justin_bieber)));
        artistArrayList.add(new Artist("Ed Sreeran", getString(R.string.about_ed_sheeran)));
        artistArrayList.add(new Artist("Wiz Khalif", getString(R.string.about_wiz_khalifa)));

        TextView tvSongName = findViewById(R.id.tv_song_name);
        tvSongName.setText(mPosition.getmSongName());

        TextView tvSongArtist = findViewById(R.id.tv_song_artist);
        tvSongArtist.setText(mPosition.getmArtistName());

        TextView tvSongArtistDescription = findViewById(R.id.tv_song_artist_description);
        for (int i=0; i<artistArrayList.size();i++){
            if (artistArrayList.get(i).getArtistName().equals(mPosition.getmArtistName())){
                tvSongArtistDescription.setText(artistArrayList.get(i).getArtistDescription());
            }
        }

        TextView goToSongsList = findViewById(R.id.tv_go_to_now_playing);
        goToSongsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SongDescription.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}
