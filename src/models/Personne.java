package models;

import java.util.ArrayList;
import java.util.List;

public class Personne {
   public static final int MAX_COPAINS = 10;

    private final String nom;
    private final String prenom; 
    private final List<Personne> copains;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.copains = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public boolean ajouterCopain(Personne nouveauCopain) {
        if (copains.size() < MAX_COPAINS && !copains.contains(nouveauCopain)) {
            copains.add(nouveauCopain);
            return true;
        }
        return false; 
    }

    public boolean supprimerCopain(Personne copainASupprimer) {
        return copains.remove(copainASupprimer); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(prenom).append(" ").append(nom.toUpperCase());

        if (copains.isEmpty()) {
            sb.append(" et ses copains ()");
        } else {
            sb.append(" et ses copains (");
            for (int i = 0; i < copains.size(); i++) {
                sb.append(copains.get(i).getPrenom()).append(" ").append(copains.get(i).getNom().toUpperCase());
                if (i < copains.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
        }

        return sb.toString();
    }
}
