package models;

import java.util.concurrent.atomic.AtomicInteger;

public class Chambre {
    private int id;
    private String numero;
    private EnumEtage etage;
    private TypeChambre type;
    private Pavillon pavillon;
    private ResponsablePavillon rp;
    private String etat;

    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }

    private static final AtomicInteger COUNT= new AtomicInteger(1);

    public Chambre()
    {
        id= COUNT.getAndIncrement();
        etat="DISPONIBLE";
        numero= "ch000"+id;
    }
    public ResponsablePavillon getRp() {
        return rp;
    }

    public void setRp(ResponsablePavillon rp) {
        this.rp = rp;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public EnumEtage getEtage() {
        return etage;
    }

    public void setEtage(EnumEtage etage) {
        this.etage = etage;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Chambre [etage=" + etage + ", etat=" + etat + ", id=" + id + ", numero=" + numero + ", pavillon="
                + pavillon + ", rp=" + rp + ", type=" + type + "]";
    }

    
}
