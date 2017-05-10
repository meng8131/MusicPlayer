package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);


        TextView goToSong = (TextView) findViewById(R.id.title_song);
        goToSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSong = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(goToSong);
            }
        });

        TextView goToArtist = (TextView) findViewById(R.id.title_artist);
        goToArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToArtist = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(goToArtist);
            }
        });

        /*
        * link to player page
         */
        TextView player = (TextView) findViewById(R.id.player_link_main);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPlayer = new Intent(AlbumActivity.this, PlayerActivity.class);
                startActivity(goToPlayer);
            }
        });
    }
}
