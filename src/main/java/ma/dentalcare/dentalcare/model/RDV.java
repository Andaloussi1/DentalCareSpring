package ma.dentalcare.dentalcare.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "RDV")
public class RDV implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name = "Acte",nullable = false)
    private String Acte;
    @Column(name = "Comfirmed",nullable = false)
    private String Etat ;
    @Column(name="Date",nullable = false)
    private Date Date;
    @Column(name = "Heure",nullable = false)
    private Time Heure;
    @Column(name = "Motif",nullable = false)
    private String Motif;
    @ManyToOne
    private Patient Patient;
    @OneToOne
    private Consultation consultation;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getActe() {
        return Acte;
    }

    public void setActe(String acte) {
        Acte = acte;
    }

    public String getEtat() {
        return Etat;
    }

    public void setEtat(String etat) {
        Etat = etat;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Time getHeure() {
        return Heure;
    }

    public void setHeure(Time heure) {
        Heure = heure;
    }

    public String getMotif() {
        return Motif;
    }

    public void setMotif(String motif) {
        Motif = motif;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient patient) {
        Patient = patient;
    }
}
