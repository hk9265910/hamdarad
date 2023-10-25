package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import dev.sagar.progress_button.ProgressButton;

public class MainActivity extends AppCompatActivity {
    ProgressButton button_p;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_p=findViewById(R.id.button_p);
        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_p.loading();
                Handler h= new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        button_p.finished();

                    }
                },5000);
            }
        });
    }
}