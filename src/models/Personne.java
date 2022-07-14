package models;

public class Personne {
    
    @Override
    public String toString() {
        return "Personne [id=" + id + ", nomComplet=" + nomComplet + "]";
    }
    protected int id;
    protected String nomComplet;
    private static int nbr=0;
    public Personne() {
        nbr++;
        id=nbr;
    }
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
