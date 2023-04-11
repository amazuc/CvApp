package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Mai 2015","Juin 2015","Direction Générale des Finances publiques","Stage BTS - MOA"));
        experiences.add(new Experience("Octobre 2015","Juin 2016","Entente Sportive Caudacienne","Service Civique - Developpement site web"));
        experiences.add(new Experience("Septembre 2022","Encours","Direction Générale des Finances publiques","Alternance Developpement"));

        ListView listViewExperiences = findViewById(R.id.ListViewExperiences);
        ExperienceBaseAdapter adapterExperience = new ExperienceBaseAdapter(experiences,this);
        listViewExperiences.setAdapter(adapterExperience);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2014","Bac Scientifique option Mathématique", "Lycée Samuel Champlain, Chennevieres sur marnes"));
        formations.add(new Formation("2016","BTS Système numérique option informatique et réseaux", "Lycée Christophe Colomb, Sucy-en-Brie"));
        formations.add(new Formation("En Cours","BAC+3 Concepteur et Développeur d'Application", "CFA-INSTA, Paris 2eme"));

        ListView listViewFormations = findViewById(R.id.ListViewFormations);
        FormationBaseAdapter adapterFormation = new FormationBaseAdapter(formations,this);
        listViewFormations.setAdapter(adapterFormation);

        Button button = findViewById(R.id.buttonCompetence);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, CompetenceActivity.class));
    }
}