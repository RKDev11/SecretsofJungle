package com.ssetcer.oefljgun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loadView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_view);
        getWindow().addFlags(1024);
        Button buttonGo = findViewById(R.id.buttonGo);
        Button buttonPr= findViewById(R.id.buttonPr);
        Button buttonEx = findViewById(R.id.buttonEx);
        Button buttonRu = findViewById(R.id.buttonRules);

        buttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGame = new Intent(loadView.this, Chill.class);
                startActivity(intentGame);
            }
        });

        buttonPr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPr = new Intent(loadView.this, PrivacyPolicy.class);
                startActivity(intentPr);
            }
        });

        buttonEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonRu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRu = new Intent(loadView.this, RulesGame.class);
                startActivity(intentRu);
            }
        });
    }
}