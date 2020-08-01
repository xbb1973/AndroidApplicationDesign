package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    Button mButton3;
    TextView mTv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mButton3 = findViewById(R.id.btn_3);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(view);
            }
        });

        mTv1 = findViewById(R.id.tv_in_btn_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(view);
            }
        });
    }

    public void showToast(View view) {
        StringBuffer btnName = new StringBuffer();
        switch (view.getId()) {
            case R.id.btn_3:
                btnName.append("btn3");
                break;
            case R.id.btn_4:
                btnName.append("btn4");
                break;
            case R.id.tv_in_btn_1:
                btnName.append("tv_in_btn_1");
                break;
            default:
                btnName.append("btn unknow");
                break;
        }
        mTv1.setText(btnName.toString() + "onclick status");
        Toast.makeText(this, btnName.toString() + "onclick status",Toast.LENGTH_SHORT).show();
    }
}