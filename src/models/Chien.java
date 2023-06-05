package models;

public class Chien {

    private static String nom;
    private int age;

    public Chien(String nomDuChien, int ageDuChien) {
        this.nom = nomDuChien;
        this.age = ageDuChien;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Je m'appelle " + nom + " et j'ai " + age + " années.";
    }
}
