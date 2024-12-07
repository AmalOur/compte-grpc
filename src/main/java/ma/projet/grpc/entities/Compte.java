package ma.projet.grpc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private float solde;
    private String dateCreation;
    private String type;
}
