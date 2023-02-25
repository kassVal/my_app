package com.example.oge_matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabloAtveti2 extends AppCompatActivity implements View.OnClickListener {

    int b=0;
    int a=0;
    int b_2=0;
    int b_3=0;
    int b_4=0;
    int b_5=0;
    int b_6=0;
    int b_7=0;
    int b_8=0;
    int b_9=0;
    int b_10=0;
    int b_11=0;
    int b_12=0;
    int b_13=0;
    int b_14=0;
    int b_15=0;
    int b_16=0;
    int b_17=0;
    int b_18=0;
    int b_19=0;

    Button btn_1;

    TextView tv_1;
    TextView tv_2;
    TextView tv_3;
    TextView tv_4;
    TextView tv_5;
    TextView tv_6;
    TextView tv_7;
    TextView tv_8;
    TextView tv_9;
    TextView tv_10;
    TextView tv_11;
    TextView tv_12;
    TextView tv_13;
    TextView tv_14;
    TextView tv_15;
    TextView tv_16;
    TextView tv_17;
    TextView tv_18;
    TextView tv_19;
    TextView kol_ball;

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
        setContentView(R.layout.activity_tablo_atveti2);

        Bundle arguments = getIntent().getExtras();
        btn_1 = findViewById(R.id.btn_);
        btn_1.setOnClickListener(this);
        tv_1 = findViewById(R.id.tv_1_2);
        tv_2 = findViewById(R.id.tv_2_2);
        tv_3 = findViewById(R.id.tv_3_2);
        tv_4 = findViewById(R.id.tv_4_2);
        tv_5 = findViewById(R.id.tv_5_2);
        tv_6 = findViewById(R.id.tv_6_2);
        tv_7 = findViewById(R.id.tv_7_2);
        tv_8 = findViewById(R.id.tv_8_2);
        tv_9 = findViewById(R.id.tv_9_2);
        tv_10 = findViewById(R.id.tv_10_2);
        tv_11 = findViewById(R.id.tv_11_2);
        tv_12 = findViewById(R.id.tv_12_2);
        tv_13 = findViewById(R.id.tv_13_2);
        tv_14 = findViewById(R.id.tv_14_2);
        tv_15 = findViewById(R.id.tv_15_2);
        tv_16 = findViewById(R.id.tv_16_2);
        tv_17 = findViewById(R.id.tv_17_2);
        tv_18 = findViewById(R.id.tv_18_2);
        tv_19 = findViewById(R.id.tv_19_2);
        kol_ball = findViewById(R.id.kol_ball2);
        et_1 = findViewById(R.id.et_);
        et_2 = findViewById(R.id.et_20);
        et_3 = findViewById(R.id.et_21);
        et_4 = findViewById(R.id.et_22);
        et_5 = findViewById(R.id.et_23);
        et_6 = findViewById(R.id.et_24);
        et_7 = findViewById(R.id.et_25);
        et_8 = findViewById(R.id.et_26);
        et_9 = findViewById(R.id.et_27);
        et_10 = findViewById(R.id.et_28);
        et_11 = findViewById(R.id.et_29);
        et_12 = findViewById(R.id.et_30);
        et_13 = findViewById(R.id.et_31);
        et_14 = findViewById(R.id.et_32);
        et_15 = findViewById(R.id.et_33);
        et_16 = findViewById(R.id.et_34);
        et_17 = findViewById(R.id.et_35);
        et_18 = findViewById(R.id.et_36);
        et_19 = findViewById(R.id.et_37);

        String edt_1 = arguments.get("edt_1").toString();
        String edt_2 = arguments.get("edt_2").toString();
        String edt_3 = arguments.get("edt_3").toString();
        String edt_4 = arguments.get("edt_4").toString();
        String edt_5 = arguments.get("edt_5").toString();
        String edt_6 = arguments.get("edt_6").toString();
        String edt_7 = arguments.get("edt_7").toString();
        String edt_8 = arguments.get("edt_8").toString();
        String edt_9 = arguments.get("edt_9").toString();
        String edt_10 = arguments.get("edt_10").toString();
        String edt_11 = arguments.get("edt_11").toString();
        String edt_12 = arguments.get("edt_12").toString();
        String edt_13 = arguments.get("edt_13").toString();
        String edt_14 = arguments.get("edt_14").toString();
        String edt_15 = arguments.get("edt_15").toString();
        String edt_16 = arguments.get("edt_16").toString();
        String edt_17 = arguments.get("edt_17").toString();
        String edt_18 = arguments.get("edt_18").toString();
        String edt_19 = arguments.get("edt_19").toString();

        if (edt_1.equals("2651")){
            tv_1.setText("2651");
            b=1;
        }else{
            tv_1.setText(edt_1);
        }
        if (edt_2.equals("0,9")){
            tv_2.setText("0,9");
            b_2 = 1;
        }else{
            tv_2.setText(edt_2);
        }
        if (edt_3.equals("3,75")){
            tv_3.setText("3,75");
            b_3 = 1;
        }else{
            tv_3.setText(edt_3);
        }
        if (edt_4.equals("5000")){
            tv_4.setText("5000");
            b_4 = 1;
        }else{
            tv_4.setText(edt_4);
        }
        if (edt_5.equals("45")){
            tv_5.setText("45");
            b_5 = 1;
        }else{
            tv_5.setText(edt_5);
        }
        if (edt_6.equals("-0,05")){
            tv_6.setText("-0,05");
            b_6 = 1;
        }else{
            tv_6.setText(edt_6);
        }
        if (edt_7.equals("2")){
            tv_7.setText("2");
            b_7 = 1;
        }else{
            tv_7.setText(edt_7);
        }
        if (edt_8.equals("-2,5")){
            tv_8.setText("-2,5");
            b_8 = 1;
        }else{
            tv_8.setText(edt_8);
        }
        if (edt_9.equals("14")){
            tv_9.setText("14");
            b_9 = 1;
        }else{
            tv_9.setText(edt_9);
        }
        if (edt_10.equals("10")){
            tv_10.setText("10");
            b_10 = 1;
        }else{
            tv_10.setText(edt_10);
        }
        if (edt_11.equals("1243")){
            tv_11.setText("1243");
            b_11 = 1;
        }else{
            tv_11.setText(edt_11);
        }
        if (edt_12.equals("2,25")){
            tv_12.setText("2,25");
            b_12 = 1;
        }else{
            tv_12.setText(edt_12);
        }
        if (edt_13.equals("4")){
            tv_13.setText("4");
            b_13 = 1;
        }else{
            tv_13.setText(edt_13);
        }
        if (edt_14.equals("4097")){
            tv_14.setText("4097");
            b_14 = 1;
        }else{
            tv_14.setText(edt_14);
        }
        if (edt_15.equals("38")){
            tv_15.setText("38");
            b_15 = 1;
        }else{
            tv_15.setText(edt_15);
        }
        if (edt_16.equals("23")){
            tv_16.setText("23");
            b_16 = 1;
        }else{
            tv_16.setText(edt_16);
        }
        if (edt_17.equals("25")){
            tv_17.setText("25");
            b_17 = 1;
        }else{
            tv_17.setText(edt_17);
        }
        if (edt_18.equals("14")){
            tv_18.setText("14");
            b_18 = 1;
        }else{
            tv_18.setText(edt_18);
        }
        if (edt_19.equals("3")){
            tv_19.setText("3");
            b_19 = 1;
        }else{
            tv_19.setText(edt_19);
        }
        a = b + b_2 + b_3 + b_4 + b_5 + b_6 + b_7 + b_8 + b_9 + b_10 + b_11 + b_12 + b_13 + b_14 + b_15 + b_16 + b_17 + b_18 + b_19;
        kol_ball.setText("Колличество баллов:"+ " "+a);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_:
                Intent intent = new Intent(this, VariantiActivity.class);
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
