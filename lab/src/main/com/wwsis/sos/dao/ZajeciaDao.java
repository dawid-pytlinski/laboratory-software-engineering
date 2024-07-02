package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Zajecia;
import java.util.List;

public interface ZajeciaDao {
    void save(Zajecia zajecia);
    void update(Zajecia zajecia);
    void delete(Zajecia zajecia);
    Zajecia findById(int id);
    List<Zajecia> findAll();
}
