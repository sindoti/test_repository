package ci.model;

import java.util.ArrayList;
import java.util.List;

public class Personne implements Affichage {
    String nom;
    String prenom;
    int age;
    float taille;
    boolean hasJob;
    String situation;

    Adresse adresse;

    List<String> diplomes;


public Personne(String n, String p, int a, float t, boolean hJ) {
nom = n;
prenom = p;
age = a;
taille = t;
hasJob = hJ;
}

public Personne(String n, String p, int a, float t) {
   
   this(n, p, a, t,false);
   }
   
   public void afficher() {
    System.out.println(
                                 "Bonjour, je suis " + this.nom + " " + this.prenom + " " + this.age + " ans et de taille "
                                                 + this.taille + " m");

    if (adresse != null) {
        adresse.afficher();
    }

    if (diplomes != null) {
        System.out.println("diplômes à choisir dans la liste : "+ this.diplomes);
    }

 }

@Override
public String toString() {
    return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille + ", hasJob=" + hasJob
            + ", situation=" + situation + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
            + super.toString() + "]";
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nom == null) ? 0 : nom.hashCode());
    result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Personne other = (Personne) obj;
    if (nom == null) {
        if (other.nom != null)
            return false;
    } else if (!nom.equalsIgnoreCase(other.nom))
        return false;
    if (prenom == null) {
        if (other.prenom != null)
            return false;
    } else if (!prenom.equalsIgnoreCase(other.prenom))
        return false;
    return true;
}

public Adresse getAdresse() {
    return adresse;
}

public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
}

public List<String> getDiplomes() {
    return diplomes;
}

public void setDiplomes(List<String> diplomes) {
    this.diplomes = diplomes;
}

@Override
public void afficherVideo() {
    System.out.println(
                                 "Hello ! " + this.nom + " " + this.prenom + " " + this.age + " ans et de taille "
                                                 + this.taille + " m");
    }
}
  


 