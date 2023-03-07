package sevice;

import model.Client;
import model.CompteCourant;
import persistance.ClientPersist;
import persistance.ComptePersist;

public class CompteService {

    private ComptePersist comptePersist = new ComptePersist();
   // public void saveCompteCourant(CompteCourant compteCourant){

      //  comptePersist.persistCompte(compteCourant);
   // }

    public void removecompte(Long id){
        comptePersist.removeCompteCourant(id);
    }

    public CompteCourant findCompteCourant(Long id){
      CompteCourant compteCourant =comptePersist.findCompteCourant(id);
        return compteCourant;
    }

    public void updateCompteCourant(Long id){
        comptePersist.updateCompteCourant(id);
    }
}
