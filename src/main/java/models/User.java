package models;

public class User {

    //attributes
    private int num;
    private String nom;
    private String prenom;
    private String role;
    //emploie dans la base d e données

    //constructors
    public User() {
    }

    public User(int num, String nom, String prenom, String role) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.role = role;
    }

    //getters
    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getRole() {
        return role;
    }

    //setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
