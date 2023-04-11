package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LanguageBaseAdapter extends BaseAdapter {
    private ArrayList<Language> languages;
    private Context context;

    public LanguageBaseAdapter(ArrayList<Language> languages, Context context) {
        this.languages = languages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return languages.size();
    }

    @Override
    public Object getItem(int position) {
        return languages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_language, parent, false);
        }

        TextView textViewLanguage = convertView.findViewById(R.id.textViewLanguages);
        textViewLanguage.setText(languages.get(position).getLanguage());
        RatingBar ratingBarNote = convertView.findViewById(R.id.ratingBarNote);
        ratingBarNote.setRating(languages.get(position).getNote());

        return convertView;
    }
}
