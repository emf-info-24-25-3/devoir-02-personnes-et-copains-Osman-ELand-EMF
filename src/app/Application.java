package app;

import models.Personne;

public class Application {
    
      public static void main(String[] args) {
        // Création de 3 personnes
        Personne personne1 = new Personne("Terrieur", "Alex");
        Personne personne2 = new Personne("D'Oeuf", "John");
        Personne personne3 = new Personne("Macaroni", "Mac");
        Personne personne4 = new Personne("Terrieur", "Alain");

        // Ajout de copains
        personne1.ajouterCopain(personne2);
        personne1.ajouterCopain(personne3);
        personne2.ajouterCopain(personne1);
        personne2.ajouterCopain(personne4);

        // Affichage des personnes avec leurs copains
        System.out.println(personne1);
        System.out.println(personne2);
        System.out.println(personne3);
        System.out.println(personne4);

        // Suppression d'un copain
        personne1.supprimerCopain(personne3);
        System.out.println("\nAprès suppression d'un copain :");
        System.out.println(personne1);
    }
}

