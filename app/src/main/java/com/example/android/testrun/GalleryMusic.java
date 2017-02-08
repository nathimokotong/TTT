package com.example.android.testrun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GalleryMusic extends AppCompatActivity {

    Button btnKwaito;
    Button btnHipHop;
    Button btnRnB;
    Button btnHouse;
    Button btnJazzandSoul;
    Button btnMgqashiyoandIsicathamiya;
    Button btnRock;
    Button btnReggae;
    Button btnAfrikaansmusic;
    Button btnGospel;
    Button btntraditional;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_music);


        btnKwaito = (Button)findViewById(R.id.Kwaito);
         btnHipHop = (Button)findViewById(R.id.Hipid);
         btnRnB = (Button)findViewById(R.id.RnBid);
         btnHouse = (Button)findViewById(R.id.Houseid);
         btnJazzandSoul = (Button)findViewById(R.id.Jazzid);
         btnMgqashiyoandIsicathamiya = (Button)findViewById(R.id.Mgqashiyoid);
         btnRock = (Button)findViewById(R.id.Rockid);
         btnReggae = (Button)findViewById(R.id.Reggaeid);
         btnAfrikaansmusic = (Button)findViewById(R.id.Afrikaansid);
         btnGospel = (Button)findViewById(R.id.Gospelid);
         btntraditional = (Button)findViewById(R.id.traditionalid) ;


        btnKwaito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Kwaito");
                startActivity(intent);

            }
        });

        btnHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Hip Hop");
                startActivity(intent);
            }
        });

        btnRnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","RnB");
                startActivity(intent);
            }
        });

        btnHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","House");
                startActivity(intent);
            }
        });

        btnJazzandSoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Jazz and Soul");
                startActivity(intent);
            }
        });

        btnMgqashiyoandIsicathamiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Mgqashiyo and Isicathamiya");
                startActivity(intent);
            }
        });

        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Rock");
                startActivity(intent);
            }
        });

        btnReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Reggae");
                startActivity(intent);
            }
        });

        btnAfrikaansmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Afrikaans music");
                startActivity(intent);
            }
        });

        btnGospel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","Gospel");
                startActivity(intent);
            }
        });

        btntraditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                intent.putExtra("Selected_Genre","traditional");
                startActivity(intent);
            }
        });

    }
}
