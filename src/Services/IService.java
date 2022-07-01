package Services;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

/**
 * IService
 */
public interface IService {
    public void ajouterPavillon(Pavillon pavillon);

    public int getPositionPavillon(int id);

    public void supprimerPavillon(Pavillon pavillon);

    public void listerPavillon();

    public void ajouterChambre(Chambre chambre);

    public void listerChambre();

    public int getPositionChambre(int id);

    public void archiverChambre(int id);

    public void ajouterEtudiant(Etudiant etudiant);
}