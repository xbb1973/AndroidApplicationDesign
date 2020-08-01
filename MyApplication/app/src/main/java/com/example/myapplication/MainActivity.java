package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mTextViewActivity, mButtonActivit, mEditTextViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextViewActivity = findViewById(R.id.text_view_activity);
        mTextViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // jump to TextViewActivity
                Intent intent = new Intent(MainActivity.this,
                        TextViewActivity.class);
                startActivity(intent);
            }
        });

        mButtonActivit = findViewById(R.id.button_activity);
        mButtonActivit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // jump to ButtonActivity
                Intent intent = new Intent(MainActivity.this,
                        ButtonActivity.class);
                startActivity(intent);
            }
        });

        mEditTextViewActivity = findViewById(R.id.edit_text_view_activity);
        mEditTextViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // jump to ButtonActivity
                Intent intent = new Intent(MainActivity.this,
                        EditTextViewActivity.class);
                startActivity(intent);
            }
        });
    }
}