package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView goToArtist = (TextView) findViewById(R.id.title_artist);
        goToArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToArtist = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(goToArtist);
            }
        });

        TextView goToAlbum = (TextView) findViewById(R.id.title_album);
        goToAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToAlbum = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(goToAlbum);
            }
        });

        TextView closer = (TextView) findViewById(R.id.song_1);
        closer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playSong);
            }
        });

        TextView pleaseBaby = (TextView) findViewById(R.id.song_2);
        pleaseBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playSong = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(playSong);
            }
        });

        /*
        * link to player page
         */
        TextView player = (TextView) findViewById(R.id.player_link_main);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToPlayer = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(goToPlayer);
            }
        });
    }
}
