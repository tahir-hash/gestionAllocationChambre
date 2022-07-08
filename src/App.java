import java.util.Scanner;

import Services.IService;
import Services.ServiceTableau;
import models.Chambre;
import models.Pavillon;

public class App {
    public static void main(String[] args) throws Exception {

        IService service = new ServiceTableau();
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
            System.out.println("6- Ajouter Etudiant");
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
                    service.listerPavillon();
                    Chambre chambre = new Chambre();
                    System.out.println("Veuillez saisir le numero d'id");
                    int idPavillon = sc.nextInt();
                    pavillon = new Pavillon();
                    pavillon.setId(idPavillon);
                    chambre.setPavillon(pavillon);
                    break;
                case 4:
                    service.listerChambre();
                    break;
                case 5:
                    System.out.println("1- Chambre");
                    break;
                case 6:
                    System.out.println("1- Chambre");
                    break;
                case 0:
                    System.out.println("1- Chambre");
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
