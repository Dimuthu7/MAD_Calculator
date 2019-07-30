package com.example.student.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView ans;
    private int no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        num1 = findViewById(R.id.editText_n1);
        num2 = findViewById(R.id.editText_n2);
        ans = findViewById(R.id.answer);

        Intent intent2 = getIntent();
        no1 = intent2.getIntExtra("no1",0);
        no2 = intent2.getIntExtra("no2",0);

        num1.setText(no1+"");
        num2.setText(no2+"");
    }

    public void add(View v){
        int sum = no1 + no2;
        ans.setText(no1+"+"+no2+": "+sum);
    }

    public void sub(View v){
        int sub = no1 - no2;
        ans.setText(no1+"-"+no2+": "+sub);
    }

    public void mul(View v){
        int mul = no1 * no2;
        ans.setText(no1+"*"+no2+": "+mul);
    }

    public void div(View v){
        int div = no1 / no2;
        ans.setText(no1+"/"+no2+": "+div);
    }

}
