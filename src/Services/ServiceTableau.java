package Services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService {
    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private int indexChambre = 0;
    private Pavillon pavillons[] = new Pavillon[NOMBRE];
    
    public Pavillon[] getPavillons() {
        return pavillons;
    }

    private int indexPavillon = 0;
    
    
    @Override
    public void ajouterChambre(Chambre chambre) {
        
        if(indexChambre < NOMBRE){
            chambres[indexChambre] = chambre;
            indexChambre++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
    }

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        
        
    }

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        if(indexPavillon < NOMBRE){
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
       }
       else{
            System.out.println("Le tableau est rempli");
       }
    }

    @Override
    public void archiverChambre(int id) {
        
        
    }

    @Override
    public int getPositionChambre(int id) {
        
        return 0;
    }

    @Override
    public int getPositionPavillon(int id) {
        
        return 0;
    }

    @Override
    public void listerChambre() {
        for (Chambre chambre : chambres) {
            if(chambre != null){
                System.out.println(chambre);
            }
        }
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : pavillons) {
            if(pavillon != null){
                System.out.println(pavillon);
            }
        }
        
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        
        
    }
    
}
