import Services.IService;
import Services.ServiceTableau;
import models.Chambre;
import models.EnumEtage;
import models.Pavillon;
import models.TypeChambre;

public class App {
    public static void main(String[] args) throws Exception {
        IService service = new ServiceTableau();
        Chambre chambre = new Chambre();

        Pavillon pavillon = new Pavillon();
        pavillon.setId(1);

        chambre.setId(1);
        chambre.setNumero("001");
        chambre.setEtage(EnumEtage.PREMIERE_ETAGE);
        chambre.setType(TypeChambre.DOUBLE);
        chambre.setPavillon(pavillon);

        service.ajouterChambre(chambre);
        service.listerChambre();    
    }
}
