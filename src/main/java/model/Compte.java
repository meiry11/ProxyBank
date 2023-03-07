package model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public abstract class Compte {

    private int numero;
    private float solde;
    private LocalDateTime ouvertureDate;


    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Client client;

    public Compte() {
    }

    public Compte(int numero, float solde, LocalDateTime ouvertureDate) {
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
}
