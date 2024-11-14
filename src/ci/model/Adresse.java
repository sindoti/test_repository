package ci.model;

public class Adresse {
private String ville;
private String codePostal;
private int rue;
public Adresse(String ville, String codePostal, int rue) {
    this.ville = ville;
    this.codePostal = codePostal;
    this.rue = rue;
}
public String getVille() {
    return ville;
}
public void setVille(String ville) {
    this.ville = ville;
}
public String getCodePostal() {
    return codePostal;
}
public void setCodePostal(String codePostal) {
    this.codePostal = codePostal;
}
public int getRue() {
    return rue;
}
public void setRue(int rue) {
    this.rue = rue;
}

public void afficher() {
    System.out.println("Ville : " + this.ville + " " + " Code postale : " + this.codePostal + " " + "Rue : " + this.rue);
 }
}
