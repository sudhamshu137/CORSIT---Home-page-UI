package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class next extends AppCompatActivity {

    TextView description;

    LinearLayout iotiot;
    LinearLayout recrec;
    LinearLayout worwor;
    LinearLayout robrob;

    Dialog epicDialog;
    ImageView closePopupPositiveImg;
    Button BtnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        epicDialog =  new Dialog(this);

        //textView scrolling action
        description = (TextView) findViewById(R.id.description);
        description.setText("sjudyfviuueiuyewviuyeiuyiuweyriuyewriuyewiurybieuwrbfyiuewrvuhebwrvuihyubewviuberuyberwvuhybewriubweiruhybviueurwbviuwehbviuwbevubweiuvbieuwbviuebvuyebwvuwebvubesubesubwvbswebvusubvusebfvjhjbsfkjhbskjdfbkjsdhbvkjhbdskjhbdsfkjhbdsfkjhbdsfkjhbvkdjhbvjsdhfvjsdhfjhbsdfjhbdsfkjhbvdskjhbdsfkjbdskjhbdskjvfhbjsdhbskjdfv");
        description.setMovementMethod(new ScrollingMovementMethod());

        //floating button action
        FloatingActionButton floating = findViewById(R.id.floating);
        floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iotiot = (LinearLayout) findViewById(R.id.iotiot);
        recrec = (LinearLayout) findViewById(R.id.recrec);
        worwor = (LinearLayout) findViewById(R.id.worwor);
        robrob = (LinearLayout) findViewById(R.id.robrob);

        iotiot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                epicDialog.setContentView(R.layout.dialog_iot);

                closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
                BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);

                closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                BtnAccept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epicDialog.show();

            }
        });


        recrec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                epicDialog.setContentView(R.layout.epic_popup_recruitments);

                closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
                BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);

                closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                BtnAccept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epicDialog.show();

            }
        });

        worwor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                epicDialog.setContentView(R.layout.epic_popup_workshop);

                closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
                BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);

                closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                BtnAccept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epicDialog.show();

            }
        });

        robrob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                epicDialog.setContentView(R.layout.epic_popup_robocor);

                closePopupPositiveImg = (ImageView) epicDialog.findViewById(R.id.closePopupPositiveImg);
                BtnAccept = (Button) epicDialog.findViewById(R.id.btnAccept);

                closePopupPositiveImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        epicDialog.dismiss();
                    }
                });

                BtnAccept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                            // Vibrate for 500 milliseconds
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            v.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
                            // robocor landing page here


                        } else {
                            //deprecated in API 26
                            v.vibrate(200);
                        }
                        epicDialog.dismiss();
                    }
                });

                epicDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                epicDialog.show();

            }
        });


    }

}