
import ci.model.PersonneAvecMethode;

public class AppAvecMethode {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("--------------------------------------------------");
        PersonneAvecMethode p1 = new PersonneAvecMethode("TIOTE", "Sindou", 40, 1.68f, true);
        System.out.println("--------------------------------------------------");

        System.out.println("--------------------------------------------------");
        PersonneAvecMethode p2 = new PersonneAvecMethode("KOUASSI", "Ismael", 20, 1.72f, false);
        System.out.println("--------------------------------------------------");

        p1.setPrenom("TOUTY");
        System.out.println(p1.getPrenom());
        
        p1.afficher();
        String situation = p1.getSituationProfessionnelle(false);
        System.out.println(situation);

        p2.afficher();
        String situation2 = p2.getSituationProfessionnelle(true);
        System.out.println(situation2);

    }
    
}