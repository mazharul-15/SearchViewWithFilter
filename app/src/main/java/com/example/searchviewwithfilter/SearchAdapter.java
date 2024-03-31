package com.example.searchviewwithfilter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SearchAdapter extends BaseAdapter {

    Context context;
    String[] data, nwData;
    LayoutInflater layoutInflater;
    SearchAdapter(Context context, String[] data)
    {
        this.context = context;
        this.data = data;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.item_view_layout, null);

        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText(data[position]);

        return view;
    }

    public void filter(String str)
    {

    }
}
