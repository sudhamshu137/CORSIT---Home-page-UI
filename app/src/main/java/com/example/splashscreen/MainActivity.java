package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.agrawalsuneet.dotsloader.loaders.LazyLoader;

public class MainActivity extends AppCompatActivity {

    String firsttime;

    LazyLoader lloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lloader = (LazyLoader) findViewById(R.id.loader);

        LazyLoader loader = new LazyLoader(this, 30, 20, ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected),
                ContextCompat.getColor(this, R.color.loader_selected));
        loader.setAnimDuration(500);
        loader.setFirstDelayDuration(100);
        loader.setSecondDelayDuration(200);
        loader.setInterpolator(new LinearInterpolator());

        lloader.addView(loader);

//        getActionBar().hide();  This line is making the app crash

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                SharedPreferences prf = getSharedPreferences("sharedprefs", Context.MODE_PRIVATE);
                firsttime = prf.getString("FirstTimeInstall","yes");

                if(firsttime.equals("yes")){

                    SharedPreferences.Editor editor = prf.edit();
                    editor.putString("FirstTimeInstall","no");
                    editor.apply();

                    Intent i = new Intent(MainActivity.this,signin.class);
                    startActivity(i);
                    finish();

                }
                else{

                    Intent i = new Intent(MainActivity.this,next.class);
                    startActivity(i);
                    finish();

                }

            }
        },2000);

    }

}