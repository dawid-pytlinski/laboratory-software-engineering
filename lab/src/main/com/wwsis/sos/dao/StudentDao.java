package pl.wwsis.sos.dao;

import pl.wwsis.sos.model.Student;
import java.util.List;

public interface StudentDao {
    void save(Student student);
    void update(Student student);
    void delete(Student student);
    Student findById(int id);
    List<Student> findAll();
}
