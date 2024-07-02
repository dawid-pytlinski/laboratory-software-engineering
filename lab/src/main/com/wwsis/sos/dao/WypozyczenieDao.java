package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Wypozyczenie;
import java.util.List;

public interface WypozyczenieDao {
    void save(Wypozyczenie wypozyczenie);
    void update(Wypozyczenie wypozyczenie);
    void delete(Wypozyczenie wypozyczenie);
    Wypozyczenie findById(int id);
    List<Wypozyczenie> findAll();
}
