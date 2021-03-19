package models;

public class Vehicule {

    //attributes
    private String matricule;
    private String image;

    //constructors
    public Vehicule() {
    }

    public Vehicule(String matricule, String image) {
        this.matricule = matricule;
        this.image = image;
    }

    //getters
    public String getMatricule() {
        return matricule;
    }

    public String getImage() {
        return image;
    }

    //setters
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
