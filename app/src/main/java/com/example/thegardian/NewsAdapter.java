package com.example.thegardian;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {

    private Activity activity;
    private ArrayList<Article> data;
    Context context;

    public NewsAdapter(Activity a, ArrayList<Article> articles) {
        activity = a;
        data=articles;
    }
    public int getCount() {
        return data.size();
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        //Need to have the format of list view content layout to display it.
        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.row_display,parent,false);
            //   LayoutInflater.from(activity).inflate(R.layout.row_display,parent,false);


        }

        Article artcle = data.get(position);

        TextView text = convertView.findViewById(R.id.rowText);
        TextView desText = convertView.findViewById(R.id.rowEdit);
        text.setText(artcle.getTitle());
        desText.setText(artcle.getDescription());

        ImageView imgView = convertView.findViewById(R.id.imageView);
        if(artcle.getUrlToImage().length()>0) {
            //Glide.with(activity).load(artcle.getUrlToImage()).into(imgView);
            try
            {

            } catch(Exception e){
                e.printStackTrace();
            }

        }
        return convertView;
    }

}






