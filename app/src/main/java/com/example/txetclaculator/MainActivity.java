package com.example.txetclaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean brackets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(View view) {
        EditText first = (EditText) findViewById(R.id.editText);
        EditText second = (EditText) findViewById(R.id.editText2);
        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        if (num1.matches("") || num2.matches("")){
            Toast.makeText(this, "Вы не ввели какое-то из чисел!",Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            Integer odin = Integer.parseInt(num1);
            Integer dwa = Integer.parseInt(num2);
            if (dwa < 0){
                brackets = true;
            }
            Integer result = odin + dwa;
            String otvet0 = odin + " + " + "(" + dwa + ")" + " = " + result;
            String otvet = odin + " + " + dwa + " = " + result;
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("result0", otvet0);
            intent.putExtra("result", otvet);
            intent.putExtra("bracks", brackets);
            startActivity(intent);
        }
    }
}