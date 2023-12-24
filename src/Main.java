import com.librairie.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n********************************************************");
        System.out.println("*********\t BIENVENU A LA BIBLIOTHEQUE DE BORIS \t************");
        System.out.println("********************************************************");
        // Definition les acteurs du livre
        ArrayList<Acteurs> actors =new ArrayList<>();
        actors.add(new Acteurs("KONAN","KOFFI"));
        actors.add(new Acteurs("AYA","CASTAGNA"));

        ArrayList<Acteurs> actors1 =new ArrayList<>();
        actors1.add(new Acteurs("KOUAO","BORIS"));

        // Definir le livre
        Livres l1 = new Livres("Memoire des pensées profondes","Resumé","AA1A11","AA_EAN","UFHB","129", new Date(2020,10,01),10,8500,actors);
        Livres l2 = new Livres("Memoire","Resumé pensées profondes","AA1A91","AA_EAN","UFHB","128", new Date(2020,10,01),10,4500,actors1);

        // Registre de tous les livres
        ArrayList<Livres> listeLivres= new ArrayList<>();
        listeLivres.addAll(List.copyOf(List.of(l1,l2)));
        System.out.println("La liste de tous les livres de la bibliotheque");
        System.out.println("______________________________________________");
        for (Livres livre: listeLivres) {
            System.out.println("ISBN\t:"+livre.getISBN());
            System.out.println("TITRE\t:"+livre.getTitre());
            System.out.println("EAN\t:"+livre.getEAN());
            System.out.println("RESUME\t:"+livre.getResume());
            System.out.println("PRIX\t:"+livre.getPrix()+" F CFA");
            System.out.println("QUANTITIE EN STOCK\t:"+livre.getStock());
            System.out.println("LES ACTEURS DU LIVRES \n");
            for (Acteurs acteur: livre.getActeurs()){
                System.out.println("NOM COMPLET\t:"+acteur.getNom()+" "+acteur.getPrenom());
            }
            System.out.println("===========================================\n");

        }

        /*
        Simulation d'achat de livres par un client
         */

        // Definition du client
        Clients c1= new Clients("KOUAO","BORIS");

        // Panier du client
        List<Panier> panier= new ArrayList<>();
        panier.add(new Panier(1,l1));
        panier.add(new Panier(3,l2));

        // Passer une commande
        Commandes com1 = new Commandes("REF_AA",new Date(), EtatCommande.EN_COURS,c1,panier);

        //RESULTAT

        System.out.println("===========COMMANDE DES ARTICLES DANS LA BIBLIOTHEQUE====");

        System.out.println("REFERENCE DE LA COMMANDE\t: "+com1.getRefCommande());

        System.out.println("DATE DE COMMANDE\t: "+com1.getDateCom());
        System.out.println("ETAT DE LA COMMANDE\t: "+com1.getEtatCom());
        System.out.println("PRIX DE LA COMMANDE\t: "+com1.getPrix_total_commande());

        System.out.println("CLIENT DE LA COMMANDE\t: "+com1.getClient().getNom()+" "+com1.getClient().getPrenom());

        System.out.println("********************************************************");
        System.out.println("\nDETAIL DE LA COMMANDE\n");
        for (Panier panierLigne: com1.getLignePanier() ) {
            System.out.println("ISBN\t:"+panierLigne.getLivre().getISBN());
            System.out.println("TITRE\t:"+panierLigne.getLivre().getTitre());
            System.out.println("EAN\t:"+panierLigne.getLivre().getEAN());
            System.out.println("RESUME\t:"+panierLigne.getLivre().getResume());
            System.out.println("PRIX\t:"+panierLigne.getLivre().getPrix()+" F CFA");
            System.out.println("QUANTITIE DANS LE PANIERK\t:"+panierLigne.getQuantite());
            System.out.println("SOUS-TOTAL\t:"+panierLigne.getSous_total());
            System.out.println("__________________________________________________");

        }
        System.out.println("FACTURE TOTALE DE LA COMMANDE\t: "+com1.getPrix_total_commande()+"\n");

        System.out.println("********************************************************");
        System.out.println("*********\t MERCI POUR VOTRE ATTENTION \t************");
        System.out.println("********************************************************");



    }
}