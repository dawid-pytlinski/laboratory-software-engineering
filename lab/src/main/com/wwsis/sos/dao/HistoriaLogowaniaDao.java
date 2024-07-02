package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.HistoriaLogowania;
import java.util.List;

public interface HistoriaLogowaniaDao {
    void save(HistoriaLogowania historiaLogowania);
    void update(HistoriaLogowania historiaLogowania);
    void delete(HistoriaLogowania historiaLogowania);
    HistoriaLogowania findById(int id);
    List<HistoriaLogowania> findAll();
}
