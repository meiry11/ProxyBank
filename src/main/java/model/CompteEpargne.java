package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
@Entity

public class CompteEpargne extends Compte{
    @Id
    @GeneratedValue
    private Long id;

    public CompteEpargne() {

    }

    public CompteEpargne(int numero, float solde, LocalDateTime ouvertureDate) {
        super(numero, solde, ouvertureDate);
    }
}
