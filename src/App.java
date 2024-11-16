import ci.models.TypeEnquete;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TypeEnquete enquete1 = new TypeEnquete(01, "Insertion", "Transversale");
        enquete1.afficher();

        }
    }