package com.librairie;

import java.util.ArrayList;
import java.util.Date;

public class Livres {
    private String titre, resume, ISBN, EAN, maison_editeur, nb_page;
    private Date date_parution;
    private int stock, prix;
    private ArrayList<Acteurs> Acteurs;

    public Livres(String titre, String resume, String ISBN, String EAN, String editeur, String nb_page, Date date_parution, int stock, int prix, ArrayList<com.librairie.Acteurs> acteurs) {
        this.titre = titre;
        this.resume = resume;
        this.ISBN = ISBN;
        this.EAN = EAN;
        this.maison_editeur = editeur;
        this.nb_page = nb_page;
        this.date_parution = date_parution;
        this.stock = stock;
        this.prix = prix;
        // Ajout des acteurs pour le livre
        Acteurs = acteurs;

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    public String getMaison_editeur() {
        return maison_editeur;
    }

    public void setMaison_editeur(String maison_editeur) {
        this.maison_editeur = maison_editeur;
    }

    public String getNb_page() {
        return nb_page;
    }

    public void setNb_page(String nb_page) {
        this.nb_page = nb_page;
    }

    public Date getDate_parution() {
        return date_parution;
    }

    public void setDate_parution(Date date_parution) {
        this.date_parution = date_parution;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public ArrayList<com.librairie.Acteurs> getActeurs() {
        return Acteurs;
    }

    public void ActeursLivres(){
        System.out.println("Les acteurs du livre\t : "+ this.getTitre()+"\n sont\t :\n");

        for ( Acteurs el: this.getActeurs()) {
            System.out.println(" Acteur\t:"+el.getNom()+" "+el.getPrenom());
        }
    }

    public void setActeurs(ArrayList<com.librairie.Acteurs> acteurs) {
        Acteurs = acteurs;
    }

    @Override
    public String toString() {
        return "Livres{" +
                "titre='" + titre + '\'' +
                ", resume='" + resume + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", EAN='" + EAN + '\'' +
                ", maison_editeur='" + maison_editeur + '\'' +
                ", nb_page='" + nb_page + '\'' +
                ", date_parution=" + date_parution +
                ", stock=" + stock +
                ", prix=" + prix +
                ", Acteurs=" + Acteurs +
                '}';
    }
}
