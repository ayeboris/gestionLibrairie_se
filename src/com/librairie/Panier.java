package com.librairie;

import java.util.ArrayList;
import java.util.Date;

public class Panier {
    private int quantite;
    private int sous_total;
    private Livres livre;


    public Panier() {
    }

    public Panier(int quantite, Livres livre) {
        this.quantite = quantite;
        this.sous_total = livre.getPrix()* quantite;
        this.livre = livre;
        //Actualise le stock du livre
        this.livre.setStock(this.livre.getStock()-this.getQuantite());
    }

    @Override
    public String toString() {
        return "Panier{" +
                "quantite=" + quantite +
                ", sous_total=" + sous_total +
                ", livre=" + livre +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getSous_total() {
        return sous_total;
    }

    public void setSous_total(int sous_total) {
        this.sous_total = sous_total;
    }

    public Livres getLivre() {
        return livre;
    }

    public void setLivre(Livres livre) {
        this.livre = livre;
    }
}
