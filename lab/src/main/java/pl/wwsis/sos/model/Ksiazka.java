package pl.wwsis.sos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Książka")
public class Ksiazka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ksiazki")
    private Integer id;

    @Column(name = "tytul")
    private String tytul;

    @Column(name = "autor")
    private String autor;

    @Column(name = "isbn", length = 20)
    private String isbn;

    @Column(name = "id_kategorii")
    private Integer idKategorii;

    @Column(name = "id_lokalizacji")
    private Integer idLokalizacji;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getIdKategorii() {
		return idKategorii;
	}

	public void setIdKategorii(Integer idKategorii) {
		this.idKategorii = idKategorii;
	}

	public Integer getIdLokalizacji() {
		return idLokalizacji;
	}

	public void setIdLokalizacji(Integer idLokalizacji) {
		this.idLokalizacji = idLokalizacji;
	}

	

}
