package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Przedmioty;
import java.util.List;

public interface PrzedmiotyDao {
    void save(Przedmioty przedmioty);
    void update(Przedmioty przedmioty);
    void delete(Przedmioty przedmioty);
    Przedmioty findById(int id);
    List<Przedmioty> findAll();
}
