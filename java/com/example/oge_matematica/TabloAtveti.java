package com.example.oge_matematica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TabloAtveti extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.activity_tablo_atveti);

        Bundle arguments = getIntent().getExtras();
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        tv_1 = findViewById(R.id.tv_1);
        tv_2 = findViewById(R.id.tv_2);
        tv_3 = findViewById(R.id.tv_3);
        tv_4 = findViewById(R.id.tv_4);
        tv_5 = findViewById(R.id.tv_5);
        tv_6 = findViewById(R.id.tv_6);
        tv_7 = findViewById(R.id.tv_7);
        tv_8 = findViewById(R.id.tv_8);
        tv_9 = findViewById(R.id.tv_9);
        tv_10 = findViewById(R.id.tv_10);
        tv_11 = findViewById(R.id.tv_11);
        tv_12 = findViewById(R.id.tv_12);
        tv_13 = findViewById(R.id.tv_13);
        tv_14 = findViewById(R.id.tv_14);
        tv_15 = findViewById(R.id.tv_15);
        tv_16 = findViewById(R.id.tv_16);
        tv_17 = findViewById(R.id.tv_17);
        tv_18 = findViewById(R.id.tv_18);
        tv_19 = findViewById(R.id.tv_19);
        kol_ball = findViewById(R.id.kol_ball);
        et_1 = findViewById(R.id.et_1);
        et_2 = findViewById(R.id.et_2);
        et_3 = findViewById(R.id.et_3);
        et_4 = findViewById(R.id.et_4);
        et_5 = findViewById(R.id.et_5);
        et_6 = findViewById(R.id.et_6);
        et_7 = findViewById(R.id.et_7);
        et_8 = findViewById(R.id.et_8);
        et_9 = findViewById(R.id.et_9);
        et_10 = findViewById(R.id.et_10);
        et_11 = findViewById(R.id.et_11);
        et_12 = findViewById(R.id.et_12);
        et_13 = findViewById(R.id.et_13);
        et_14 = findViewById(R.id.et_14);
        et_15 = findViewById(R.id.et_15);
        et_16 = findViewById(R.id.et_16);
        et_17 = findViewById(R.id.et_17);
        et_18 = findViewById(R.id.et_18);
        et_19 = findViewById(R.id.et_19);

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

        if (edt_1.equals("6243")){
            tv_1.setText("6243");
            b=1;
        }else{
            tv_1.setText(edt_1);
        }
        if (edt_2.equals("18")){
            tv_2.setText("18");
            b_2 = 1;
        }else{
            tv_2.setText(edt_2);
        }
        if (edt_3.equals("14,56")){
            tv_3.setText("14,56");
            b_3 = 1;
        }else{
            tv_3.setText(edt_3);
        }
        if (edt_4.equals("2")){
            tv_4.setText("2");
            b_4 = 1;
        }else{
            tv_4.setText(edt_4);
        }
        if (edt_5.equals("4")){
            tv_5.setText("4");
            b_5 = 1;
        }else{
            tv_5.setText(edt_5);
        }
        if (edt_6.equals("17,5")){
            tv_6.setText("17,5");
            b_6 = 1;
        }else{
            tv_6.setText(edt_6);
        }
        if (edt_7.equals("4")){
            tv_7.setText("4");
            b_7 = 1;
        }else{
            tv_7.setText(edt_7);
        }
        if (edt_8.equals("72")){
            tv_8.setText("72");
            b_8 = 1;
        }else{
            tv_8.setText(edt_8);
        }
        if (edt_9.equals("-23")){
            tv_9.setText("-23");
            b_9 = 1;
        }else{
            tv_9.setText(edt_9);
        }
        if (edt_10.equals("0,9604")){
            tv_10.setText("0,9604");
            b_10 = 1;
        }else{
            tv_10.setText(edt_10);
        }
        if (edt_11.equals("-1")){
            tv_11.setText("-1");
            b_11 = 1;
        }else{
            tv_11.setText(edt_11);
        }
        if (edt_12.equals("0,8")){
            tv_12.setText("0,8");
            b_12 = 1;
        }else{
            tv_12.setText(edt_12);
        }
        if (edt_13.equals("3")){
            tv_13.setText("3");
            b_13 = 1;
        }else{
            tv_13.setText(edt_13);
        }
        if (edt_14.equals("97")){
            tv_14.setText("97");
            b_14 = 1;
        }else{
            tv_14.setText(edt_14);
        }
        if (edt_15.equals("78")){
            tv_15.setText("78");
            b_15 = 1;
        }else{
            tv_15.setText(edt_15);
        }
        if (edt_16.equals("24")){
            tv_16.setText("24");
            b_16 = 1;
        }else{
            tv_16.setText(edt_16);
        }
        if (edt_17.equals("120")){
            tv_17.setText("120");
            b_17 = 1;
        }else{
            tv_17.setText(edt_17);
        }
        if (edt_18.equals("11")){
            tv_18.setText("11");
            b_18 = 1;
        }else{
            tv_18.setText(edt_18);
        }
        if (edt_19.equals("2")){
            tv_19.setText("2");
            b_19 = 1;
        }else{
            tv_19.setText(edt_19);
        }
        a = b + b_2 + b_3 + b_4 + b_5 + b_6 + b_7 + b_8 + b_9 + b_10 + b_11 + b_12 + b_13 + b_14 + b_15 + b_16 + b_17 + b_18 + b_19;
        kol_ball.setText("?????????????????????? ????????????:"+ " "+a);
    }





    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
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