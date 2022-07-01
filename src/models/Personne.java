package models;

public class Personne {
    protected int id;
    protected String nomComplet;

    public int getId() {
        return id;
    }
    
    public String getNomComplet() {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
}
