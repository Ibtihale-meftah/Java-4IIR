package Hachage;

import java.util.HashSet;

public class GestionEtudiants {
    private HashSet<Etudiant> etudiants = new HashSet<>();

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void afficherEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }
}
