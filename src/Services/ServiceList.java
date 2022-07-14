package Services;

import java.util.List;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceList implements IService {
    private List<Pavillon> pavillons;
    private List<Chambre> chambres;
    private List<Etudiant> etudiants;

    public ServiceList(List<Pavillon> pavillons, List<Chambre> chambres, List<Etudiant> etudiants) {
        this.pavillons = pavillons;
        this.chambres = chambres;
        this.etudiants = etudiants;
    }

    @Override
    public void ajouterChambre(Chambre chambre) {
        chambres.add(chambre);
    }

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    @Override
    public void listerEtudiant() {
        System.out.println(etudiants);
    }
    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        pavillons.add(pavillon);
        /// System.out.println(pavillons);
    }

    @Override
    public void archiverChambre(int id) {
        Chambre ch = getPositionChambre(id);
        ch.setEtat("ARCHIVER");
    }

    @Override
    public Chambre getPositionChambre(int id) {

        Chambre chambre = null;
        for (Chambre c : chambres) {
            if (c != null && c.getId() == id) {
                chambre = c;
            }
        }
        return chambre;
    }

    @Override
    public Pavillon getPavillonById(int id) {

        Pavillon pavillon = null;
        for (Pavillon p : pavillons) {
            if (p != null && p.getId() == id) {
                pavillon = p;
            }
        }
        return pavillon;
    }

    @Override
    public void listerChambre() {
        System.out.println(chambres);
    }

    @Override
    public void listerPavillon() {

        System.out.println(pavillons);
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        pavillons.remove(pavillon);
    }

    

}
