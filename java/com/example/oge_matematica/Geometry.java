package com.example.oge_matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Geometry extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry);

        button1 = findViewById(R.id.btn11);
        button2 = findViewById(R.id.btn12);
        button3 = findViewById(R.id.btn13);
        button4 = findViewById(R.id.btn14);
        button5 = findViewById(R.id.btn15);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn11:
                Intent intent = new Intent(this, TGK.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn12:
                Intent intent = new Intent(this, TP.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn13:
                Intent intent = new Intent(this, YSO.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn14:
                Intent intent = new Intent(this, SVCH.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn15:
                Intent intent = new Intent(this, SOCH.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}