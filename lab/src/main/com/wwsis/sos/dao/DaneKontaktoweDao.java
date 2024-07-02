package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.DaneKontaktowe;
import java.util.List;

public interface DaneKontaktoweDao {
    void save(DaneKontaktowe daneKontaktowe);
    void update(DaneKontaktowe daneKontaktowe);
    void delete(DaneKontaktowe daneKontaktowe);
    DaneKontaktowe findById(int id);
    List<DaneKontaktowe> findAll();
}
