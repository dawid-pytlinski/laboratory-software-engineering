package pl.wwsis.sos.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Wypożyczenie")
public class Wypozyczenie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_wypozyczenia")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_studenta")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_ksiazki")
    private Ksiazka ksiazka;

    @Column(name = "data_wypozyczenia")
    private LocalDateTime dataWypozyczenia;

    @Column(name = "data_zwrotu")
    private LocalDateTime dataZwrotu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public LocalDateTime getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(LocalDateTime dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public LocalDateTime getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(LocalDateTime dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    
}

