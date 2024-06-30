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
@Table(name = "Historia_Logowania")
public class HistoriaLogowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_logowania")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_konto_użytkownika")
    private KontoUzytkownika kontoUzytkownika;

    @Column(name = "data_logowania")
    private LocalDateTime dataLogowania;

    @Column(name = "wynik_logowania")
    private String wynikLogowania;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KontoUzytkownika getKontoUzytkownika() {
		return kontoUzytkownika;
	}

	public void setKontoUzytkownika(KontoUzytkownika kontoUzytkownika) {
		this.kontoUzytkownika = kontoUzytkownika;
	}

	public LocalDateTime getDataLogowania() {
		return dataLogowania;
	}

	public void setDataLogowania(LocalDateTime dataLogowania) {
		this.dataLogowania = dataLogowania;
	}

	public String getWynikLogowania() {
		return wynikLogowania;
	}

	public void setWynikLogowania(String wynikLogowania) {
		this.wynikLogowania = wynikLogowania;
	}

	
}

