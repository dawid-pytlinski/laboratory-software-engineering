package pl.wwsis.sos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Status_Wypożyczenia")
public class StatusWypozyczenia {

    @Id
    @Column(name = "klucz", length = 20)
    private String klucz;

    @Column(name = "wartość")
    private String wartosc;

	public String getKlucz() {
		return klucz;
	}

	public void setKlucz(String klucz) {
		this.klucz = klucz;
	}

	public String getWartosc() {
		return wartosc;
	}

	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}

	

}

