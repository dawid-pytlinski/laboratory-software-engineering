package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.KontoUzytkownika;
import java.util.List;

public interface KontoUzytkownikaDao {
    void save(KontoUzytkownika kontoUzytkownika);
    void update(KontoUzytkownika kontoUzytkownika);
    void delete(KontoUzytkownika kontoUzytkownika);
    KontoUzytkownika findById(int id);
    List<KontoUzytkownika> findAll();
}
