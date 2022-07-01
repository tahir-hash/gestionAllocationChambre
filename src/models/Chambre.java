package models;

public class Chambre {
    private int id;
    private int numero;
    private String etage;
    private TypeChambre type;
    private Pavillon pavillon;
    private ResponsablePavillon  rp; 
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

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
