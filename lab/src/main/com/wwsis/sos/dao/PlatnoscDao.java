package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Platnosc;
import java.util.List;

public interface PlatnoscDao {
    void save(Platnosc platnosc);
    void update(Platnosc platnosc);
    void delete(Platnosc platnosc);
    Platnosc findById(int id);
    List<Platnosc> findAll();
}
