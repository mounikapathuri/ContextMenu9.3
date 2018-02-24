package com.example.mounikapathuri.contextmenu93;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by mounikapathuri on 24-02-2018.
 */

class ListviewAdapter extends BaseAdapter {

    TextView tvTitle;
    TextView tvDescription;

    Activity context;
    String title[];
    String description[];

    public ListviewAdapter(Activity context,String[] title,String[] description){
        super();
        this.context = context;
        this.title = title;
        this.description = description;
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = context.getLayoutInflater();

        if(view==null){
            view = layoutInflater.inflate(R.layout.custom_listview,null);
            tvTitle= (TextView) view.findViewById(R.id.call);
            tvDescription= (TextView) view.findViewById(R.id.sms);
        }
        tvTitle.setText(title[i]);
        tvDescription.setText(description[i]);
        return view;
    }
}
