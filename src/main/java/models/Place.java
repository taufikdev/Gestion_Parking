package models;

public class Place {

    //attributes
    private int num;
    private boolean etat;
    private Bloc bloc;

    //constructors
    public Place() {
    }

    public Place(int num, boolean etat, Bloc bloc) {
        this.num = num;
        this.etat = etat;
        this.bloc = new Bloc(bloc.getNom());
    }

    //getters
    public int getNum() {
        return num;
    }

    public boolean isEtat() {
        return etat;
    }

    public Bloc getBloc() {
        return bloc;
    }

    //setters
    public void setNum(int num) {
        this.num = num;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = new Bloc(bloc.getNom());
    }

}
