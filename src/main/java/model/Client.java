package model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private String ville;
    private String telephone;

    @OneToMany(mappedBy = "client",cascade = {CascadeType.PERSIST})//
    private Set<CompteCourant>compteCourants= new HashSet<>();



    public Client() {
    }

    public Client(String nom, String prenom, String adresse, int codePostal, String ville, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<CompteCourant> getCompteCourants() {
        return compteCourants;
    }

    public void setCompteCourants(Set<CompteCourant> compteCourants) {
        this.compteCourants = compteCourants;
    }

    public void addCompteCourant(CompteCourant compteCourant){
        compteCourants.add(compteCourant);
        compteCourant.setClient(this);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
    public void transfert(CompteCourant compteCourantA, CompteCourant compteCourantB){
        //if()
    }
}
