package Hashmaap;

import java.util.HashMap;

public class GestionProjet {
        private HashMap<Employe, Projet> mapEmployeProjet = new HashMap<>();

        public void associer(Employe e, Projet p) {
            mapEmployeProjet.put(e, p);
        }

        public void afficherAssociations() {
            for (java.util.Map.Entry<Employe, Projet> entry : mapEmployeProjet.entrySet()) {
                System.out.println(entry.getKey() + " travaille sur " + entry.getValue());
            }
        }
    }
