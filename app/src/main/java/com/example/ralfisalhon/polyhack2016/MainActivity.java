package com.example.ralfisalhon.polyhack2016;

import android.content.pm.ActivityInfo;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    private int dabs = 0;
    private Button clicker;
    private TextView number;
    private ImageView picture;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        clicker = (Button) findViewById(R.id.clicker);
        clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                dabs++;
                numberIncrease();
            }
        });

        number = (TextView) findViewById(R.id.textView);
        number.setText((Integer.toString(dabs)));
        number.setBackgroundColor(Color.parseColor("#ffffff"));

        picture = (ImageView) findViewById(R.id.imageView);

        //clicker.setBackgroundResource(R.drawable.button);

        mp = MediaPlayer.create(this, R.raw.dab);
        //mp.start();
    }

    protected void numberIncrease(){
        mp.start();

        number.setText((Integer.toString(dabs)));
        if(dabs % 2 == 0){
            picture.setImageResource(R.drawable.pic5);
        }
        else{
            picture.setImageResource(R.drawable.pic6);
        }
        if(dabs == 100){
            picture.setImageResource(R.drawable.hillarywhip2);
        }
        if(dabs == 101){
            picture.setImageResource(R.drawable.hillarywhip);
        }
        if(dabs == 42){
            picture.setImageResource(R.drawable.trump);
        }
        if(dabs % 3 == 0){
            number.setBackgroundColor(Color.parseColor("#FF5555"));
            picture.setBackgroundColor(Color.parseColor("#FF5555"));
            //clicker.setBackgroundColor(Color.parseColor("#FF5555"));

        }
        if(dabs % 3 == 1){
            number.setBackgroundColor(Color.parseColor("#0061ff"));
            picture.setBackgroundColor(Color.parseColor("#0061ff"));
            //clicker.setBackgroundColor(Color.parseColor("#0061ff"));
        }
        if(dabs % 3 == 2){
            number.setBackgroundColor(Color.parseColor("#ffffff"));
            picture.setBackgroundColor(Color.parseColor("#ffffff"));
            //clicker.setBackgroundColor(Color.parseColor("#ffffff"));
        }
    }

}
