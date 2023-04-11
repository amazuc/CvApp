package com.example.moncvapp;

import android.widget.RatingBar;

public class Language {
    private String language;
    private float note;

    public Language(){
    }

    public Language(String language, float note) {
        this.language = language;
        this.note = note;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Language{" +
                "language='" + language + '\'' +
                ", note=" + note +
                '}';
    }
}
