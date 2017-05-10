package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView goToSong = (TextView) findViewById(R.id.title_song);
        goToSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSong = new Intent(ArtistActivity.this, MainActivity.class);
                startActivity(goToSong);
            }
        });

        TextView goToAlbum = (TextView) findViewById(R.id.title_album);
        goToAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAlbum = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(goToAlbum);
            }
        });

        /*
        * link to player page
         */
        TextView player = (TextView) findViewById(R.id.player_link_main);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPlayer = new Intent(ArtistActivity.this, PlayerActivity.class);
                startActivity(goToPlayer);
            }
        });
    }
}
