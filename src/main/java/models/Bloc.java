package models;

public class Bloc {

    //attributes
    private String nom;

    //constructors
    public Bloc() {
    }

    public Bloc(String nom) {
        this.nom = nom;
    }

    //getters
    public String getNom() {
        return nom;
    }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }
}
