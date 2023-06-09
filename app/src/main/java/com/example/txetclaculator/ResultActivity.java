package com.example.txetclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    String OTVET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultALL = (TextView) findViewById(R.id.textViewresult);
        Bundle args = getIntent().getExtras();
        boolean skobki = args.getBoolean("bracks");
        if (skobki == true){
            OTVET = args.get("result0").toString();
        }
        else OTVET = args.get("result").toString();

        resultALL.setText(OTVET);
    }
}