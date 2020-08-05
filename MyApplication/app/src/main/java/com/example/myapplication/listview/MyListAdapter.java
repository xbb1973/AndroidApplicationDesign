package com.example.myapplication.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

public class MyListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater mLayoutInfalter;

    public MyListAdapter(Context context) {
        this.context = context;
        mLayoutInfalter = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView tvTitle;
        public TextView tvDate;
        public TextView tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = mLayoutInfalter.inflate(R.layout.layout_list_item, null);

            viewHolder = new ViewHolder();
            viewHolder.imageView = view.findViewById(R.id.iv_in_list_item);
            viewHolder.tvTitle = view.findViewById(R.id.tv_title);
            viewHolder.tvDate = view.findViewById(R.id.tv_date);
            viewHolder.tvContent = view.findViewById(R.id.tv_content);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        // init component
        String imageUrl = "https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png";
        Glide.with(context).load(imageUrl).into(viewHolder.imageView);
        viewHolder.tvTitle.setText("title1");
        viewHolder.tvDate.setText("date1");
        viewHolder.tvContent.setText("content1");



        return view;
    }
}
