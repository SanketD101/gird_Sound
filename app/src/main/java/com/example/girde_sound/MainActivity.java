package com.example.girde_sound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    public void allSound(View view){

        Button clickButton = (Button)view;
        switch (clickButton.getId()){
            case R.id.button1:
                mp = MediaPlayer.create(this,R.raw.coin);
                mp.start();
                break;
            case R.id.button2:
                mp = MediaPlayer.create(this,R.raw.attention);
                mp.start();
                break;
            case R.id.button3:
                mp = MediaPlayer.create(this,R.raw.attention);
                mp.start();
                break;
            case  R.id.button4:
                mp = MediaPlayer.create(this,R.raw.peepr);
                mp.start();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}