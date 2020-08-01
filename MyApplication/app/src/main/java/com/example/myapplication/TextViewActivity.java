package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView textView4, textView5, textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        textView4 = findViewById(R.id.tv4);
        // 中划线
        textView4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        // 去除锯齿
        textView4.getPaint().setAntiAlias(true);

        textView5 = findViewById(R.id.tv5);
        // 下划线
        textView5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        textView5.getPaint().setAntiAlias(true);

        textView6 = findViewById(R.id.tv6);
        textView6.setText(Html.fromHtml("<u>I am TextView</u>"));
    }
}