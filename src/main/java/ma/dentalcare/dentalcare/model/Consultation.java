package ma.dentalcare.dentalcare.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Consultation")
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long ID;
    @Column(name = "Date",nullable = false)
    private Date Date;
    @Column(name = "Note",nullable = false)
    private String Note;
    @OneToOne(mappedBy = "consultation")
    private RDV RdV;

    @ManyToOne
    private Patient Patient;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public RDV getRdV() {
        return RdV;
    }

    public void setRdV(RDV rdV) {
        RdV = rdV;
    }
}
