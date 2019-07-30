package com.example.student.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editText1);
        e2 = findViewById(R.id.editText2);
    }

    public void sendData(View v){
        Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);

        int no1 = Integer.parseInt(e1.getText().toString());
        int no2 = Integer.parseInt(e2.getText().toString());
        intent1.putExtra("no1",no1);
        intent1.putExtra("no2",no2);

        startActivity(intent1);
    }
}
