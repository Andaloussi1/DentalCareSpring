package ma.dentalcare.dentalcare.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Secretaire")
public class Secretaire  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name="Nom",nullable = false)
    private String Nom;
    @Column(name="Prenom",nullable = false)
    private String Prenom;
    @Column(name="Telephone")
    private Long Telephone;
    @Column(name="UserName",nullable = false)
    private String UserName;
    @Column(name="Password",nullable = false)
    private String Password;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public Long getTelephone() {
        return Telephone;
    }

    public void setTelephone(Long telephone) {
        Telephone = telephone;
    }

    public Secretaire(String nom, String prenom, Long telephone, String userName, String password) {
        Nom = nom;
        Prenom = prenom;
        Telephone = telephone;
        UserName = userName;
        Password = password;
    }
    public Secretaire(){}
}
