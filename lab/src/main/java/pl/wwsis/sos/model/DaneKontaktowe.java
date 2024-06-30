package pl.wwsis.sos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Dane_Kontaktowe")
public class DaneKontaktowe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dane_kontaktowe")
    private Integer id;

    @Column(name = "nazwa_ulicy")
    private String nazwaUlicy;

    @Column(name = "nr_domu", length = 10)
    private String nrDomu;

    @Column(name = "nr_mieszkania", length = 10)
    private String nrMieszkania;

    @Column(name = "kod_pocztowy", length = 10)
    private String kodPocztowy;

    @Column(name = "miejscowosc")
    private String miejscowosc;

    @Column(name = "email")
    private String email;

    @Column(name = "telefon", length = 20)
    private String telefon;

    @ManyToOne
    @JoinColumn(name = "id_studenta")
    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwaUlicy() {
        return nazwaUlicy;
    }

    public void setNazwaUlicy(String nazwaUlicy) {
        this.nazwaUlicy = nazwaUlicy;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
