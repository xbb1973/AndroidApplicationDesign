package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mTextViewActivity, mButtonActivit, mEditTextActivity;
    private Button mRadioButtonActivity, mCheckBoxActivity, mImageViewActivity;
    private Button mListViewActivity, mGridViewActivity, mScrollViewActivity;
    private Button mRecyclerViewActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViewById();
        setOnClickListener();
    }

    private void bindViewById() {
        mTextViewActivity = findViewById(R.id.text_view_activity);
        mButtonActivit = findViewById(R.id.button_activity);
        mEditTextActivity = findViewById(R.id.edit_text_view_activity);
        mRadioButtonActivity = findViewById(R.id.radio_button_activity);
        mCheckBoxActivity = findViewById(R.id.check_box_activity);
        mImageViewActivity = findViewById(R.id.image_view_activity);

        mListViewActivity = findViewById(R.id.list_view_activity);
        mGridViewActivity = findViewById(R.id.grid_view_activity);
        mScrollViewActivity = findViewById(R.id.scroll_view_activity);
        mRecyclerViewActivity = findViewById(R.id.recycler_view_activity);
    }

    private void setOnClickListener() {
        OnClick onClick = new OnClick();
        mTextViewActivity.setOnClickListener(onClick);
        mButtonActivit.setOnClickListener(onClick);
        mEditTextActivity.setOnClickListener(onClick);
        mRadioButtonActivity.setOnClickListener(onClick);
        mCheckBoxActivity.setOnClickListener(onClick);
        mImageViewActivity.setOnClickListener(onClick);

        mListViewActivity.setOnClickListener(onClick);
        mGridViewActivity.setOnClickListener(onClick);
        mScrollViewActivity.setOnClickListener(onClick);
        mRecyclerViewActivity.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            StringBuffer btnName = new StringBuffer();

            Intent intent = new Intent();
            switch (view.getId()) {
                case R.id.text_view_activity:
                    btnName.append("button_activity");
                    // jump to ButtonActivity
                    intent = new Intent(MainActivity.this,
                            TextViewActivity.class);
                    break;
                case R.id.button_activity:
                    btnName.append("button_activity");
                    // jump to ButtonActivity
                    intent = new Intent(MainActivity.this,
                            ButtonActivity.class);
                    break;
                case R.id.edit_text_view_activity:
                    btnName.append("edit_text_view_activity");
                    // jump to EditTextViewActivity
                    intent = new Intent(MainActivity.this,
                            EditTextViewActivity.class);
                    break;
                case R.id.radio_button_activity:
                    btnName.append("radio_button_activity");
                    // jump to RadioButtonActivity
                    intent = new Intent(MainActivity.this,
                            RadioButtonActivity.class);
                    break;
                case R.id.check_box_activity:
                    btnName.append("check box activity");
                    // jump to CheckBoxActivity
                    intent = new Intent(MainActivity.this,
                            CheckBoxActivity.class);
                    break;
                case R.id.image_view_activity:
                    btnName.append("ImageViewActivity");
                    // jump to ImageViewActivity
                    intent = new Intent(MainActivity.this,
                            ImageViewActivity.class);
                    break;
                case R.id.list_view_activity:
                    btnName.append("ListViewActivity");
                    intent = new Intent(MainActivity.this,
                            ListViewActivity.class);
                    break;
                default:
                    btnName.append("btn unknow");
                    break;
            }
            Toast.makeText(MainActivity.this, btnName.toString() + "onclick status", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
    }
}