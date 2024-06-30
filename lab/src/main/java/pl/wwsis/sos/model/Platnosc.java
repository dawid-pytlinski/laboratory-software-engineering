package pl.wwsis.sos.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Płatność")
public class Platnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platnosci")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_konto")
    private KontoUzytkownika konto;

    @Column(name = "kwota")
    private BigDecimal kwota;

    @Column(name = "data_księgowania")
    private LocalDate dataKsiegowania;

    @Column(name = "data_platnosci")
    private LocalDate dataPlatnosci;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KontoUzytkownika getKonto() {
		return konto;
	}

	public void setKonto(KontoUzytkownika konto) {
		this.konto = konto;
	}

	public BigDecimal getKwota() {
		return kwota;
	}

	public void setKwota(BigDecimal kwota) {
		this.kwota = kwota;
	}

	public LocalDate getDataKsiegowania() {
		return dataKsiegowania;
	}

	public void setDataKsiegowania(LocalDate dataKsiegowania) {
		this.dataKsiegowania = dataKsiegowania;
	}

	public LocalDate getDataPlatnosci() {
		return dataPlatnosci;
	}

	public void setDataPlatnosci(LocalDate dataPlatnosci) {
		this.dataPlatnosci = dataPlatnosci;
	}

	
}
