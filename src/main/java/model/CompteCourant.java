package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
@Entity
public class CompteCourant {
    @Id
    @GeneratedValue
    private Long id;
    private int numero;
    private float solde;
    private LocalDateTime ouvertureDate;
    @ManyToOne
    private Client client;


    public CompteCourant() {
        super();
    }

    public CompteCourant(int numero, float solde, LocalDateTime ouvertureDate) {
        this.numero = numero;
        this.solde = solde;
        this.ouvertureDate = ouvertureDate;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public LocalDateTime getOuvertureDate() {
        return ouvertureDate;
    }

    public void setOuvertureDate(LocalDateTime ouvertureDate) {
        this.ouvertureDate = ouvertureDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
