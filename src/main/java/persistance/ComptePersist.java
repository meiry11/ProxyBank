package persistance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Client;
import model.Compte;
import model.CompteCourant;

public class ComptePersist {

    /*public void persistCompte(CompteCourant compteCourant) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();


        try {
            txn.begin();

            em.persist(compteCourant);

            txn.commit();
        } catch (
                Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }*/

    public void removeCompteCourant(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();


        try {
            txn.begin();
            CompteCourant compteCourant = em.find(CompteCourant.class, id);
            em.remove(compteCourant);
            txn.commit();
        } catch (
                Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }

    public CompteCourant findCompteCourant(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();

        CompteCourant compteCourant = new CompteCourant();

        try {
            txn.begin();
            compteCourant = em.find(CompteCourant.class, id);

            txn.commit();
        } catch (
                Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
        return compteCourant;
    }

    public void updateCompteCourant(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();


        try {
            txn.begin();
            CompteCourant compteCourant = em.find(CompteCourant.class, id);
            compteCourant.setNumero(111111);

            txn.commit();
        } catch (
                Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }

    }


}
