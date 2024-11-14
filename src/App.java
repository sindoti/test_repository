import java.util.ArrayList;
import java.util.List;

import ci.model.Adresse;
import ci.model.Affichage;
import ci.model.Etudiant;
import ci.model.Personne;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        System.out.println("----------------------------------------------------");*/

        Personne p1 = new Personne("TIOTE", "Sindou", 40, 1.68f, true);
        p1.afficher();
       System.out.println("-------------------------------------------------------------------");
       // p1.situation = (p1.hasJob) ? "en emploi" : " au chômage";

       /* Personne p2 = new Personne("tiote", "sindou", 30, 1.72f, false);

        boolean isPersonneEquals = p1.equals(p2);
        System.out.println(isPersonneEquals);*/

        Adresse adresse = new Adresse("Abidjan", "bpv 1", 12);
        //adresse.afficher();
        Personne p2 = new Personne("tiote", "sindou", 30, 1.72f, false);
        p2.setAdresse(adresse);
        p2.afficher();
        System.out.println("--------------------------------------------------------------");
        List<String> diplomes = new ArrayList<>();
        diplomes.add("CAP");
        diplomes.add("BT");
        diplomes.add("BTS");

        p1.setDiplomes(diplomes);
        p1.afficher();

        System.out.println("------------------------------------------------------------");

        Affichage affichage = new Personne("Mouad", "Jules", 45, 1.75f);
            affichage.afficherVideo();

       // p2.situation = (p2.hasJob) ? "en emploi" : " au chômage";

       // p2.afficher();

       /*  Personne[] personnes = new Personne[2];
        personnes[0] = p1;
        personnes[1] = p2;
               for (int i = 0; i < personnes.length; i++) {      
        System.out.println(personnes[i]);
            }
       for (Personne pers : personnes) {
           pers.afficher();
        }
        
        List<Personne> personnes = new ArrayList<>();
        personnes.add(p1);
        personnes.add(p2);

        for (Personne pers : personnes) {
            //pers.afficher();
            System.out.println(pers);
        }
System.out.println("-------------------------------------------------");
        Etudiant etudiant = new Etudiant();
        etudiant.afficher();*/

        
    }
}