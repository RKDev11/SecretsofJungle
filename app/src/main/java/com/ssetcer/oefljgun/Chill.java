package com.ssetcer.oefljgun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Chill extends AppCompatActivity {
    ImageView[] iconsSsetcerOefljgun = new ImageView[5];
    TextView textViewSsetcerOefljgun;
    public Handler handlerSsetcerOefljgun;
    int y1SsetcerOefljgun;
    int y2SsetcerOefljgun;
    int y3SsetcerOefljgun;
    int y4SsetcerOefljgun;
    int y5SsetcerOefljgun;
    public boolean startSsetcerOefljgun = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chill);
        getWindow().addFlags(1024);
        Button button = findViewById(R.id.button);
        textViewSsetcerOefljgun = findViewById(R.id.text);


        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        iconsSsetcerOefljgun[0] = imageView1;
        iconsSsetcerOefljgun[1] = imageView2;
        iconsSsetcerOefljgun[2] = imageView3;
        iconsSsetcerOefljgun[3] = imageView4;
        iconsSsetcerOefljgun[4] = imageView5;


        imageView1.animate().translationY(-200).setDuration(0);
        imageView2.animate().translationY(-200).setDuration(0);
        imageView3.animate().translationY(-200).setDuration(0);
        imageView4.animate().translationY(-200).setDuration(0);
        imageView5.animate().translationY(-200).setDuration(0);
        handlerSsetcerOefljgun = new Handler();


        textViewSsetcerOefljgun.setVisibility(View.INVISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewSsetcerOefljgun.setVisibility(View.INVISIBLE);
                startSsetcerOefljgun = true;
                handlerSsetcerOefljgun.post(new Runnable() {
                    @Override
                    public void run() {
                        if (startSsetcerOefljgun) {
                            anim();
                            handlerSsetcerOefljgun.postDelayed(this::run, 3000);
                            handlerSsetcerOefljgun.post(new Runnable() {
                                @Override
                                public void run() {
                                    y1SsetcerOefljgun = position(imageView1);
                                    y2SsetcerOefljgun = position(imageView2);
                                    y3SsetcerOefljgun = position(imageView3);
                                    y4SsetcerOefljgun = position(imageView4);
                                    y5SsetcerOefljgun = position(imageView5);

                                    if (y1SsetcerOefljgun > 1900 || y2SsetcerOefljgun > 1900 || y3SsetcerOefljgun > 1900 || y4SsetcerOefljgun > 1900 || y5SsetcerOefljgun > 1900) {
                                        textViewSsetcerOefljgun.setVisibility(View.VISIBLE);
                                        button.setVisibility(View.VISIBLE);
                                        startSsetcerOefljgun = false;
                                    }
                                    handlerSsetcerOefljgun.postDelayed(this::run, 10);
                                }
                            });
                        }
                    }
                });
                view.setVisibility(View.GONE);
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.animate().translationY(-200).setDuration(0);

            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.animate().translationY(-200).setDuration(0);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView3.animate().translationY(-200).setDuration(0);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView4.animate().translationY(-200).setDuration(0);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView5.animate().translationY(-200).setDuration(0);
            }
        });
    }

    private int position(ImageView imageView) {
        int[] locationOnScreent = new int[2];
        imageView.getLocationOnScreen(locationOnScreent);
        int y1 = locationOnScreent[1];
        return y1;
    }

    private void anim() {
        int r = randomImageValue();
        iconsSsetcerOefljgun[r].animate().translationY(2000).setDuration(3000).withEndAction(new Runnable() {
            @Override
            public void run() {
                iconsSsetcerOefljgun[r].animate().translationY(-200).setDuration(0);
            }
        }).start();
    }

    private int randomImageValue() {
        Random random = new Random();
        return random.nextInt(5);
    }

}