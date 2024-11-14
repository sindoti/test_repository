package ci.model;
public class PersonneAvecMethode {
   private String nom;
   private String prenom;
   private int age;
   private float taille;
   private boolean hasJob;
   
public PersonneAvecMethode(String nom, String prenom, int age, float taille, boolean hasJob) {
   this.nom = nom;
   this.prenom = prenom;
   this.age = age;
   this.taille = taille;
   this.hasJob = hasJob;
   System.out.println("Constructeur PersonneAvecMethode avec 5 paramètres");
   }

  public PersonneAvecMethode(String nom, String prenom, int age) {
   this(nom, prenom, age,1.88f,true);
   System.out.println("Constructeur PersonneAvecMethode avec 3 param");
}



public String getNom() {
   return nom;
}



public void setNom(String nom) {
   this.nom = nom;
}



public String getPrenom() {
   return prenom;
}



public void setPrenom(String prenom) {
   this.prenom = prenom;
}



public int getAge() {
   return age;
}



public void setAge(int age) {
   this.age = age;
}



public float getTaille() {
   return taille;
}



public void setTaille(float taille) {
   this.taille = taille;
}



public boolean isHasJob() {
   return hasJob;
}



public void setHasJob(boolean hasJob) {
   this.hasJob = hasJob;
}



public void afficher() {
   System.out.println(
                                "Bonjour, je suis " + this.nom + " " + this.prenom + " " + this.age + " ans et de taille "
                                                + this.taille
                                                + " m");
}

public String getSituationProfessionnelle() {
   String situation = age < 25 ? "en emploi" : "au chômage";
   return situation;
}  

public String getSituationProfessionnelle(boolean hasJob) {
   String situation = hasJob ? "en emploi" : "au chômage";
   return situation;

}

@Override
public String toString() {
   return "PersonneAvecMethode [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", taille=" + taille + ", hasJob="
         + hasJob + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge()
         + ", getTaille()=" + getTaille() + ", isHasJob()=" + isHasJob() + ", getClass()=" + getClass()
         + ", getSituationProfessionnelle()=" + getSituationProfessionnelle() + ", hashCode()=" + hashCode()
         + ", toString()=" + super.toString() + "]";
}



}