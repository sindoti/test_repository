import ci.models.Enquete;
import ci.models.TypeEnquete;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TypeEnquete typenquete1 = new TypeEnquete(01, "Insertion", "Transversale");
        typenquete1.afficher();

        Enquete enquete1 = new Enquete(1, "desFormes", "se situe", typenquete1);

        enquete1.afficher2();
        }
    }