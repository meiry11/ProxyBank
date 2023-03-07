package presentation;

import model.Client;
import model.CompteCourant;
import persistance.ClientPersist;
import sevice.ClientService;
import sevice.CompteService;

import java.lang.Long;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        //Client client = new Client("Ben","Antoine3","rue Albert",2050,"Lille","03-25-58-58");
        Client client1 = new Client("Aliou","Antoine3","rue Albert",2050,"Lille","03-25-58-58");
        //CompteCourant compteCourant = new CompteCourant(8888,1000, LocalDateTime.now());
        CompteCourant compteCourant1 = new CompteCourant(66666,5000, LocalDateTime.now());
        CompteCourant compteCourant2 = new CompteCourant(77777,1000, LocalDateTime.now());
        ClientService clientService = new ClientService();
        //clientService.saveClient(client,compteCourant);
        clientService.saveClient(client1,compteCourant1);
        //clientService.saveClient(client,compteCourant2);


        //compteCourant.setClient(client);
        //CompteService compteService = new CompteService();
        //compteService.saveCompteCourant(compteCourant);
        //ClientService clientService = new ClientService();
        //clientService.updateClient(1L);
        //clientService.saveClient(client);
        //Client client = clientService.findClient(2L);
        //System.out.println(client.toString());


       // CompteCourant compteCourant1 = new CompteCourant(33333,3254, LocalDateTime.now());
        //CompteCourant compteCourant2 = new CompteCourant(44444,2000, LocalDateTime.now());

        //compteService.saveCompteCourant(compteCourant);
        //compteService.saveCompteCourant(compteCourant1);
        //compteService.saveCompteCourant(compteCourant2);
       //compteService.removecompte(52L);
      //CompteCourant compteCourant = compteService.findCompteCourant(152L);
        //System.out.println(compteCourant.toString());
        //compteService.updateCompteCourant(152L);

    }
}