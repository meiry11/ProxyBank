package persistance;

import model.Client;

import jakarta.persistence.*;
import model.CompteCourant;

import java.util.Set;

public class ClientPersist {
    public void persistClient(Client client, CompteCourant compteCourant) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();


        try {
            txn.begin();
            client.addCompteCourant(compteCourant);
            em.persist(client);

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

    public void removeClient(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();


        try {
            txn.begin();
            Client client = em.find(Client.class,id);
            em.remove(client);
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

    public Client findClient(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();

        Client client = new Client();

        try {
            txn.begin();
             client = em.find(Client.class,id);

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
        return client;
    }

    public void updateClient(Long id) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        EntityTransaction txn = em.getTransaction();



        try {
            txn.begin();
            Client client = em.find(Client.class,id);
            client.setNom("Yacouba");

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

