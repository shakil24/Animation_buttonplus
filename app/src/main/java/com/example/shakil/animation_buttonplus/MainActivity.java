package com.example.shakil.animation_buttonplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView tiger;
    Button game,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tiger=findViewById(R.id.tiger);
        game=findViewById(R.id.game);
        back=findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int duration,x,y;

                duration= 3000;

                //x=360;
                y= 300;

                tiger.animate().translationY(y).setDuration(duration). start();

            }
        });



        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int duration,x,y;

                duration= 3000;

                //x=360;
                y= -650;

                tiger.animate().translationY(y).setDuration(duration). start();

            }
        });







    }
}
