package com.example.moncvapp;

public class Projet {
    private String nom;
    private String lien;
    private String description;

    public Projet(){
    }

    public Projet(String nom, String lien, String description) {
        this.nom = nom;
        this.lien = lien;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "nom='" + nom + '\'' +
                ", lien='" + lien + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
