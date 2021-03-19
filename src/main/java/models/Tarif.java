package models;

public class Tarif {

    //attributes
    private float tarif;
    private String periode;

    //constructors
    public Tarif(float tarif, String periode) {
        this.tarif = tarif;
        this.periode = periode;
    }

    public Tarif() {
    }

    //getters
    public float getTarif() {
        return tarif;
    }

    public String getPeriode() {
        return periode;
    }

    //setters
    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

}
