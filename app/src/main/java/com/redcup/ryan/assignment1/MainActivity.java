/*
A Ryan McKinney Production:

This is a DJ Khaled advice app,
by pressing the button, a user will hear a
famous DJ Khaled soundbyte, some of which are motivational

 */





package com.redcup.ryan.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //add all sounds to array list

        mp = MediaPlayer.create(this, R.raw.a);
    }




    public void anotherOne(View view) {
        Button b = (Button) findViewById(R.id.giveMeButton);
        b.setText("Another One");
        playRandomSound();

    }



    private void playRandomSound() {

        if (mp.isPlaying()) {
            mp.stop();
            mp.release();
        }
        Random rm = new Random();
        int randInt = rm.nextInt(6);
        if (randInt == 0) {
            mp = MediaPlayer.create(this, R.raw.a);
        } else if (randInt == 1) {
            mp = MediaPlayer.create(this, R.raw.b);
        } else if (randInt == 2) {
            mp = MediaPlayer.create(this, R.raw.c);
        } else if (randInt == 3) {
            mp = MediaPlayer.create(this, R.raw.d);
        } else if (randInt == 4) {
            mp = MediaPlayer.create(this, R.raw.e);
        } else if (randInt == 5) {
            mp = MediaPlayer.create(this, R.raw.f);
        }


        mp.start();

    }
}
