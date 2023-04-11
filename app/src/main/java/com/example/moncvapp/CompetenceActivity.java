package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Language> languages = new ArrayList<Language>();
        languages.add(new Language(" Java :        ", 4.5f));
        languages.add(new Language(" C++ :         ", 4f));
        languages.add(new Language(" PHP :         ", 3.5f));

        ListView listViewLanguages = findViewById(R.id.ListViewLanguages);
        LanguageBaseAdapter adapterLanguage = new LanguageBaseAdapter(languages, this);
        listViewLanguages.setAdapter(adapterLanguage);

        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("CV App", "https://github.com/", "Application mobile de présentation de CV - Java(Android Studio)"));
        projets.add(new Projet("Quizz App", "https://github.com/", "Application desktop de quizz - Java"));
        projets.add(new Projet("Evenement App", "https://github.com/", "Application web de gestion d'evenement au sein d'une entreprise - Symphony"));

        ListView listViewProjets = findViewById(R.id.ListViewProjets);
        ProjetBaseAdapter adapterProjet = new ProjetBaseAdapter(projets, this);
        listViewProjets.setAdapter(adapterProjet);
    }
}
