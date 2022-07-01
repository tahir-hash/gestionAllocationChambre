package models;

public class Pavillon {
    private int id;
    private int nbrEtage;
    private int numero;
    private ResponsablePavillon  rp; 
    public ResponsablePavillon getRp() {
        return rp;
    }

    public void setRp(ResponsablePavillon rp) {
        this.rp = rp;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNbrEtage() {
        return nbrEtage;
    }
    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pavillon [id=" + id + ", nbrEtage=" + nbrEtage + ", numero=" + numero + ", rp=" + rp + "]";
    }
    
}
