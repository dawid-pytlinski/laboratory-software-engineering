package pl.wwsis.sos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Konto_Użytkownika")
public class KontoUzytkownika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_konto")
    private Integer id;

    @Column(name = "id_uzytkownika")
    private Integer idUzytkownika;

    @Column(name = "nazwa_uzytkownika")
    private String nazwaUzytkownika;

    @Column(name = "haslo")
    private String haslo;

    @Column(name = "status_konta")
    private String statusKonta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdUzytkownika() {
		return idUzytkownika;
	}

	public void setIdUzytkownika(Integer idUzytkownika) {
		this.idUzytkownika = idUzytkownika;
	}

	public String getNazwaUzytkownika() {
		return nazwaUzytkownika;
	}

	public void setNazwaUzytkownika(String nazwaUzytkownika) {
		this.nazwaUzytkownika = nazwaUzytkownika;
	}

	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

	public String getStatusKonta() {
		return statusKonta;
	}

	public void setStatusKonta(String statusKonta) {
		this.statusKonta = statusKonta;
	}

	
}

