package ma.dentalcare.dentalcare.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Medecin")
public class Medecin  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name="Nom",nullable = false)
    private String Nom;
    @Column(name = "Prenom",nullable = false)
    private String Prenom;
    @Column(name = "Specialite",nullable = false)
    private String Specialite;
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

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }

    public Medecin(String nom, String prenom, String specialite, String userName, String password) {
        Nom = nom;
        Prenom = prenom;
        Specialite = specialite;
        UserName = userName;
        Password = password;
    }
    public Medecin(){}
}
