package com.example.oge_matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Variant3 extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    EditText et_1;
    EditText et_2;
    EditText et_3;
    EditText et_4;
    EditText et_5;
    EditText et_6;
    EditText et_7;
    EditText et_8;
    EditText et_9;
    EditText et_10;
    EditText et_11;
    EditText et_12;
    EditText et_13;
    EditText et_14;
    EditText et_15;
    EditText et_16;
    EditText et_17;
    EditText et_18;
    EditText et_19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variant3);

        btn = findViewById(R.id.button8);

        et_1 = findViewById(R.id.et_38);
        et_2 = findViewById(R.id.et_39);
        et_3 = findViewById(R.id.et_40);
        et_4 = findViewById(R.id.et_41);
        et_5 = findViewById(R.id.et_42);
        et_6 = findViewById(R.id.et_43);
        et_7 = findViewById(R.id.et_44);
        et_8 = findViewById(R.id.et_45);
        et_9 = findViewById(R.id.et_46);
        et_10 = findViewById(R.id.et_47);
        et_11 = findViewById(R.id.et_48);
        et_12 = findViewById(R.id.et_49);
        et_13 = findViewById(R.id.et_50);
        et_14 = findViewById(R.id.et_51);
        et_15 = findViewById(R.id.et_52);
        et_16 = findViewById(R.id.et_53);
        et_17 = findViewById(R.id.et_54);
        et_18 = findViewById(R.id.et_55);
        et_19 = findViewById(R.id.et_56);
    }

    @Override
    public void onClick(View view) {
        String edt_1 = et_1.getText().toString();
        String edt_2 = et_2.getText().toString();
        String edt_3 = et_3.getText().toString();
        String edt_4 = et_4.getText().toString();
        String edt_5 = et_5.getText().toString();
        String edt_6 = et_6.getText().toString();
        String edt_7 = et_7.getText().toString();
        String edt_8 = et_8.getText().toString();
        String edt_9 = et_9.getText().toString();
        String edt_10 = et_10.getText().toString();
        String edt_11 = et_11.getText().toString();
        String edt_12 = et_12.getText().toString();
        String edt_13 = et_13.getText().toString();
        String edt_14 = et_14.getText().toString();
        String edt_15 = et_15.getText().toString();
        String edt_16 = et_16.getText().toString();
        String edt_17 = et_17.getText().toString();
        String edt_18 = et_18.getText().toString();
        String edt_19 = et_19.getText().toString();
        switch (view.getId()) {
            case R.id.button8:
                Intent intent = new Intent(this, TabloAtveti3.class);
                intent.putExtra("edt_1", edt_1);
                intent.putExtra("edt_2", edt_2);
                intent.putExtra("edt_3", edt_3);
                intent.putExtra("edt_4", edt_4);
                intent.putExtra("edt_5", edt_5);
                intent.putExtra("edt_6", edt_6);
                intent.putExtra("edt_7", edt_7);
                intent.putExtra("edt_8", edt_8);
                intent.putExtra("edt_9", edt_9);
                intent.putExtra("edt_10", edt_10);
                intent.putExtra("edt_11", edt_11);
                intent.putExtra("edt_12", edt_12);
                intent.putExtra("edt_13", edt_13);
                intent.putExtra("edt_14", edt_14);
                intent.putExtra("edt_15", edt_15);
                intent.putExtra("edt_16", edt_16);
                intent.putExtra("edt_17", edt_17);
                intent.putExtra("edt_18", edt_18);
                intent.putExtra("edt_19", edt_19);

                startActivity(intent);
                break;
            default:
                break;

        }
    }

    @Override
    public void onBackPressed() {
    }
}
