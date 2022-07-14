import java.util.ArrayList;
import java.util.Scanner;

import Services.IService;
import Services.ServiceList;
import models.Chambre;
import models.Etudiant;
//import models.EnumEtage;
import models.Pavillon;
import models.TypeChambre;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {

        IService service = new ServiceList(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        // IService service = new ServiceTableau();
        int choix = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Veuillez choisir");
            System.out.println("--------------------------------\n");
            System.out.println("1- Ajouter Pavillon");
            System.out.println("2- Lister Pavillon");
            System.out.println("3- Ajouter Chambre");
            System.out.println("4- Lister Chambre");
            System.out.println("5- archiver Chambre");
            System.out.println("6- Supprimer Pavillon");
            System.out.println("7- Ajouter etudiant");
            System.out.println("8- Lister etudiant");

            System.out.println("0- Quitter");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    Pavillon pavillon = new Pavillon();
                    System.out.println("Veuillez saisir le nombre d'etage");
                    int etage = sc.nextInt();
                    pavillon.setNbrEtage(etage);
                    System.out.println("Veuillez saisir le numero du pavillon");
                    int num = sc.nextInt();
                    pavillon.setNumero(num);
                    service.ajouterPavillon(pavillon);
                    break;
                case 2:
                    service.listerPavillon();
                    break;
                case 3:
                    Chambre chambre = new Chambre();
                    System.out.println("Veuillez choisir un pavillon");
                    service.listerPavillon();
                    int idPavillon = sc.nextInt();
                    pavillon = service.getPavillonById(idPavillon);
                    if (pavillon != null) {
                        chambre.setPavillon(pavillon);
                        System.out.println("Veuillez choisir le type de chambre \n 1" + TypeChambre.values()[0] + "\n 2"
                                + TypeChambre.values()[1]);
                        int type = sc.nextInt();
                        if (type == 1) {
                            chambre.setType(TypeChambre.values()[0]);
                        } else if (type == 2) {
                            chambre.setType(TypeChambre.values()[1]);
                        }
                        service.ajouterChambre(chambre);
                    } else {
                        System.out.println("Pavillon indisponible");

                    }
                    break;
                case 4:
                    service.listerChambre();
                    break;
                case 5:
                    System.out.println("Veuillez choisir une chambre à archiver");
                    service.listerChambre();
                    int idChambre = sc.nextInt();
                    service.archiverChambre(idChambre);
                    break;
                case 6:
                    System.out.println("veuillez saisir l'id du pavillon à supprimer");
                    service.listerPavillon();
                    int id = sc.nextInt();
                    pavillon = service.getPavillonById(id);
                    service.supprimerPavillon(pavillon);
                    break;
                case 7:
                    Etudiant etudiant = new Etudiant();
                    System.out.println("Veuillez saisir le nom complet de l'etudiant");
                    String nomcomplet = sc.next();
                    System.out.println("Veuillez saisir l'email");
                    String email = sc.next();
                    System.out.println("Veuillez saisir le numero telephone de l'etudiant");
                    String tel = sc.next();
                    System.out.println("Veuillez saisir la dateNaissance de l'etudiant format jj/mm//yy");
                    String dateN = sc.next();
                    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateN);
                    etudiant.setNomComplet(nomcomplet);
                    etudiant.setEmail(email);
                    etudiant.setTelephone(tel);
                    etudiant.setDateNaissance(date);
                    service.ajouterEtudiant(etudiant);
                    break;
                case 8:
                    service.listerEtudiant();
                    break;
                default:
                    System.out.println("Veuillez saisir un numero valide");
                    break;

            }
        } while (choix != 0);
        /*
         * IService service = new ServiceTableau();
         * Chambre chambre = new Chambre();
         * 
         * Pavillon pavillon = new Pavillon();
         * pavillon.setId(1);
         * 
         * chambre.setId(1);
         * chambre.setNumero("001");
         * chambre.setEtage(EnumEtage.PREMIERE_ETAGE);
         * chambre.setType(TypeChambre.DOUBLE);
         * chambre.setPavillon(pavillon);
         * 
         * service.ajouterChambre(chambre);
         * service.listerChambre();
         */
    }

}
