package com.example.ralfisalhon.polyhack2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private int dabs = 0;
    private Button clicker;
    private TextView number;
    private ImageView picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        picture = (ImageView) findViewById(R.id.imageView);

        //Button myButton = (Button) findViewById(R.id.clicker);
        //myButton.setBackgroundResource(R.drawable.flag);
    }

    protected void numberIncrease(){
        number.setText((Integer.toString(dabs)));
        if(dabs % 2 == 0){
            picture.setImageResource(R.drawable.pic1);
        }
        else{
            picture.setImageResource(R.drawable.pic2);
        }
        if(dabs % 3 == 0){
            number.setBackgroundColor(Color.parseColor("#FF5555"));
            picture.setBackgroundColor(Color.parseColor("#FF5555"));
        }
        if(dabs % 3 == 1){
            number.setBackgroundColor(Color.parseColor("#ffffff"));
            picture.setBackgroundColor(Color.parseColor("#ffffff"));
        }
        if(dabs % 3 == 2){
            number.setBackgroundColor(Color.parseColor("#0061ff"));
            picture.setBackgroundColor(Color.parseColor("#0061ff"));
        }
    }

}
