package Services;

import java.util.List;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceList implements IService {
     private List<Pavillon> pavillons;
     private List  <Chambre> chambres;

    public ServiceList(List<Pavillon> pavillons, List<Chambre> chambres) {
        this.pavillons = pavillons;
        this.chambres = chambres;
    }

    @Override
    public void ajouterChambre(Chambre chambre) {
        
    }

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        pavillons.add(pavillon);
        ///System.out.println(pavillons);
    }

    @Override
    public void archiverChambre(int id) {
        
        
    }

    @Override
    public int getPositionChambre(int id) {
        
        return 0;
    }

    @Override
    public Pavillon getPavillonById(int id) {
        
        Pavillon pavillon=null;
        return pavillon;
    }

    @Override
    public void listerChambre() {
        
        
    }

    @Override
    public void listerPavillon() {
        
        System.out.println(pavillons);

    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        
        
    }
    
}
