package pl.wwsis.sos.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Zajęcia")
public class Zajecia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zajęć")
    private Integer id;

    @Column(name = "dzień")
    private Integer dzien;

    @Column(name = "godzina_rozpoczęcia")
    private LocalTime godzinaRozpoczecia;

    @Column(name = "godzina_zakończenia")
    private LocalTime godzinaZakonczenia;

    @Column(name = "nr_sali", length = 10)
    private String nrSali;

    @Column(name = "rodzaj_zajęć")
    private String rodzajZajec;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDzien() {
		return dzien;
	}

	public void setDzien(Integer dzien) {
		this.dzien = dzien;
	}

	public LocalTime getGodzinaRozpoczecia() {
		return godzinaRozpoczecia;
	}

	public void setGodzinaRozpoczecia(LocalTime godzinaRozpoczecia) {
		this.godzinaRozpoczecia = godzinaRozpoczecia;
	}

	public LocalTime getGodzinaZakonczenia() {
		return godzinaZakonczenia;
	}

	public void setGodzinaZakonczenia(LocalTime godzinaZakonczenia) {
		this.godzinaZakonczenia = godzinaZakonczenia;
	}

	public String getNrSali() {
		return nrSali;
	}

	public void setNrSali(String nrSali) {
		this.nrSali = nrSali;
	}

	public String getRodzajZajec() {
		return rodzajZajec;
	}

	public void setRodzajZajec(String rodzajZajec) {
		this.rodzajZajec = rodzajZajec;
	}

	

}

