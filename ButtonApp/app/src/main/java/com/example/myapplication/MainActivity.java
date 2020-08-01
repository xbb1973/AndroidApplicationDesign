package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView, mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_tv_1);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // jump to TextViewActivity
                Intent intent = new Intent(MainActivity.this,
                        TextViewActivity.class);
                startActivity(intent);
            }
        });

        mButton1 = findViewById(R.id.btn_btn_1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // jump to ButtonActivity
                Intent intent = new Intent(MainActivity.this,
                        ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}