package models;

import java.time.LocalDateTime;

public class Stationnement {

    //attributes
    private int num;
    private Vehicule vehicule;
    private Place place;
    private LocalDateTime date_entree;
    private LocalDateTime date_sortie;
    private Tarif tarif;

    //constructors
    public Stationnement(int num, Vehicule vehicule, Place place, LocalDateTime date_entree, LocalDateTime date_sortie, Tarif tarif) {
        this.num = num;
        this.vehicule = new Vehicule(vehicule.getMatricule(),vehicule.getImage());
        this.place = new Place(place.getNum(),place.isEtat(),place.getBloc());
        this.date_entree = date_entree;
        this.date_sortie = date_sortie;
        this.tarif = new Tarif(tarif.getTarif(),tarif.getPeriode());
    }

    public Stationnement() {
    }

    //getters
    public int getNum() {
        return num;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public Place getPlace() {
        return place;
    }

    public LocalDateTime getDate_entree() {
        return date_entree;
    }

    public LocalDateTime getDate_sortie() {
        return date_sortie;
    }

    public Tarif getTarif() {
        return tarif;
    }

    //setters
    public void setNum(int num) {
        this.num = num;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = new Vehicule(vehicule.getMatricule(),vehicule.getImage());
    }

    public void setPlace(Place place) {
        this.place = new Place(place.getNum(),place.isEtat(),place.getBloc());
    }

    public void setDate_entree(LocalDateTime date_entree) {
        this.date_entree = date_entree;
    }

    public void setDate_sortie(LocalDateTime date_sortie) {
        this.date_sortie = date_sortie;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = new Tarif(tarif.getTarif(),tarif.getPeriode());
    }

}
