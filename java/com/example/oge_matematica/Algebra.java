package com.example.oge_matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Algebra extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);

        button1 = findViewById(R.id.button4);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button4:
                Intent intent = new Intent(this, FCU.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn2:
                Intent intent = new Intent(this, AKK.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn3:
                Intent intent = new Intent(this, AP.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn4:
                Intent intent = new Intent(this, GP.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn5:
                Intent intent = new Intent(this, KOV.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}