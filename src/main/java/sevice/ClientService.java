package sevice;

import model.Client;
import model.CompteCourant;
import persistance.ClientPersist;

public class ClientService {
    private ClientPersist clientPersist = new ClientPersist();
    public void saveClient(Client client, CompteCourant compteCourant){

        clientPersist.persistClient(client,compteCourant);
    }

    public void removeclient(Long id){
       clientPersist.removeClient(id);
    }

    public Client findClient(Long id){
        Client client =clientPersist.findClient(id);
        return client;
    }

    public void updateClient(Long id){
        clientPersist.updateClient(id);
    }
}
