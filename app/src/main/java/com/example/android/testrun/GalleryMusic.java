package com.example.android.testrun;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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
    CountDownTimer timer = null;

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

        btnKwaito.setClickable(true);
        btnHipHop.setClickable(true);
        btnRnB.setClickable(true);
        btnHouse.setClickable(true);
        btnJazzandSoul.setClickable(true);
        btnMgqashiyoandIsicathamiya.setClickable(true);
        btnRock.setClickable(true);
        btnReggae.setClickable(true);
        btnAfrikaansmusic.setClickable(true);
        btnGospel.setClickable(true);
        btntraditional.setClickable(true);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        final Animation clic = AnimationUtils.loadAnimation(this, R.anim.alpha);

        btnKwaito.startAnimation(myAnim);
        btnHipHop.startAnimation(myAnim);
        btnRnB.startAnimation(myAnim);
        btnHouse.startAnimation(myAnim);
        btnJazzandSoul.startAnimation(myAnim);
        btnMgqashiyoandIsicathamiya.startAnimation(myAnim);
        btnRock.startAnimation(myAnim);
        btnReggae.startAnimation(myAnim);
        btnAfrikaansmusic.startAnimation(myAnim);
        btnGospel.startAnimation(myAnim);
        btntraditional.startAnimation(myAnim);


        btnKwaito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                btnKwaito.startAnimation(clic);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(3000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Kwaito");
                        startActivity(intent);
                    }
                }.start();


            }
        });

        btnHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                btnKwaito.setClickable(false);
                btnHipHop.startAnimation(clic);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Hip Hop");
                        startActivity(intent);
                    }
                }.start();

            }
        });

        btnRnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.startAnimation(clic);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","RnB");
                        startActivity(intent);

                    }
                }.start();

            }
        });

        btnHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.startAnimation(clic);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);
                btnHouse.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {
                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","House");
                        startActivity(intent);

                    }
                }.start();


            }
        });

        btnJazzandSoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.startAnimation(clic);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Jazz and Soul");
                        startActivity(intent);

                    }
                }.start();
            }
        });

        btnMgqashiyoandIsicathamiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.startAnimation(clic);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Mgqashiyo and Isicathamiya");
                        startActivity(intent);

                    }
                }.start();
            }
        });

        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.startAnimation(clic);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Rock");
                        startActivity(intent);


                    }
                }.start();

            }
        });

        btnReggae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.startAnimation(clic);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Reggae");
                        startActivity(intent);


                    }
                }.start();
            }
        });

        btnAfrikaansmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.startAnimation(clic);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Afrikaans music");
                        startActivity(intent);


                    }
                }.start();

            }
        });

        btnGospel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.startAnimation(clic);
                btnGospel.setClickable(false);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","Gospel");
                        startActivity(intent);


                    }
                }.start();
            }
        });

        btntraditional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnKwaito.setClickable(false);
                btnHipHop.setClickable(false);
                btnRnB.setClickable(false);
                btnHouse.setClickable(false);
                btnJazzandSoul.setClickable(false);
                btnMgqashiyoandIsicathamiya.setClickable(false);
                btnRock.setClickable(false);
                btnReggae.setClickable(false);
                btnAfrikaansmusic.setClickable(false);
                btnGospel.setClickable(false);
                btntraditional.startAnimation(clic);
                btntraditional.setClickable(false);

                timer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {

                    }
                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(GalleryMusic.this,GendreActivity.class);
                        intent.putExtra("Selected_Genre","traditional");
                        startActivity(intent);


                    }
                }.start();
            }
        });

    }

    @Override
    public void onBackPressed()
    { super.onBackPressed(); // optional //you may put your intent here, putExtra, startActivity
        Intent intent = new Intent(GalleryMusic.this,MainActivity.class);
        startActivity(intent);
        finish();
    }




}
