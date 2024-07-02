package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Wykladowca;
import java.util.List;

public interface WykladowcaDao {
    void save(Wykladowca wykladowca);
    void update(Wykladowca wykladowca);
    void delete(Wykladowca wykladowca);
    Wykladowca findById(int id);
    List<Wykladowca> findAll();
}
