package models;

import java.util.concurrent.atomic.AtomicInteger;

public class Chambre {
    private int id;
    private String numero;
    private EnumEtage etage;
    private TypeChambre type;
    private Pavillon pavillon;
    private ResponsablePavillon rp;
    private static final AtomicInteger COUNT= new AtomicInteger(1);

    public Chambre()
    {
        id= COUNT.getAndIncrement();
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
        return "Chambre [etage=" + etage + ", id=" + id + ", numero=" + numero + ", pavillon=" + pavillon + ", rp=" + rp
                + ", type=" + type + "]";
    }

}
