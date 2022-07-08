package models;

import java.util.concurrent.atomic.AtomicInteger;

public class Pavillon {
    private int id;
    private int nbrEtage;
    private int numero;
    private ResponsablePavillon  rp; 
    private static final AtomicInteger COUNT= new AtomicInteger(1);

    public Pavillon()
    {
        id= COUNT.getAndIncrement();
    }
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
