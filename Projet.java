package Hashmaap;

import java.util.HashMap;

public class Projet {
    private String nomProjet;

    public Projet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    @Override
    public String toString() {
        return "Projet{" + "nomProjet='" + nomProjet + '\'' + '}';
    }
}
