package com.librairie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commandes {
    private String refCommande;
    private Date dateCom;
    private EtatCommande etatCom;
    private int prix_total_commande;

    //Nom complet du client
    private Clients client;

    private List<Panier> lignePanier;

    @Override
    public String toString() {
        return "Commandes{" +
                "refCommande='" + refCommande + '\'' +
                ", dateCom=" + dateCom +
                ", etatCom=" + etatCom +
                ", prix_total_commande=" + prix_total_commande +
                ", client=" + client +
                ", lignePanier=" + lignePanier +
                '}';
    }

    public Commandes() {
        lignePanier = new ArrayList<>();
    }

    public Commandes(String refCommande, Date dateCom, EtatCommande etatCom, Clients client, List<Panier> lignePanier) {
        this.refCommande = refCommande;
        this.dateCom = dateCom;
        this.etatCom = etatCom;
        this.prix_total_commande = 0;
        for (Panier el:lignePanier) {
            this.prix_total_commande += el.getSous_total();
        }
        this.client = client;
        this.lignePanier = lignePanier;
    }



    public String getRefCommande() {
        return refCommande;
    }

    public void setRefCommande(String refCommande) {
        this.refCommande = refCommande;
    }

    public Date getDateCom() {
        return dateCom;
    }

    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }

    public EtatCommande getEtatCom() {
        return etatCom;
    }

    public void setEtatCom(EtatCommande etatCom) {
        this.etatCom = etatCom;
    }

    public int getPrix_total_commande() {
        return prix_total_commande;
    }

    public void setPrix_total_commande(int prix_total_commande) {
        this.prix_total_commande = prix_total_commande;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public List<Panier> getLignePanier() {
        return lignePanier;
    }

    public void setLignePanier(List<Panier> lignePanier) {
        this.lignePanier = lignePanier;
    }
}
