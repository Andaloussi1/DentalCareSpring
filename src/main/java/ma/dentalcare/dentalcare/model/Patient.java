package ma.dentalcare.dentalcare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Patient")
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name = "adresse" , nullable = true)
    private String adresse;
    @Column(name = "nom" , nullable = true)
    private String nom;
    @Column(name = "prenom" , nullable = true)
    private String prenom;
    @Column(name = "telephone" , nullable = true)
    private Long telephone;
    @Column(name="username",nullable = true)
    private String username;
    @Column(name="password",nullable = true)
    private String password;

    @OneToMany(mappedBy = "Patient")
    private Collection<Consultation> Consultation;
    @OneToMany(mappedBy = "Patient")
    private Collection<RDV> RDVs;


}
