import ci.models.Enquete;
import ci.models.TypeEnquete;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("-------------------------------------------------------------------");

        TypeEnquete typenquete1 = new TypeEnquete(01, "Insertion", "Transversale");
        typenquete1.afficher();
        TypeEnquete typenquete2 = new TypeEnquete(02, "Satisfaction", "Panel");
        typenquete2.afficher();
                   
        
        System.out.println("-------------------------------------------------------------------");

        Enquete enquete1 = new Enquete(1, "desFormes", "se situe", typenquete1);
        enquete1.afficher2();

        System.out.println("-------------------------------------------------------------------");

        Enquete enquete2 = new Enquete(2, "desPartenaires", "se situe", typenquete2);
        enquete2.afficher2();
        }
    }