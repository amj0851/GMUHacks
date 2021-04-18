package com.example.hackathon_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ProgressBar barOne = findViewById(R.id.progressBar5);
        barOne.setMax(100);
        //int amountOne = 10;


        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            int amountOne = 10;
            @Override
            public void onClick(View v) {
                amountOne = amountOne + 10;
                barOne.setProgress(amountOne);
            }
        });
    }


}