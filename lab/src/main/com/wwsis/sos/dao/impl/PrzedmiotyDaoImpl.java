package com.wwsis.sos.dao.impl;

import com.wwsis.sos.dao.PrzedmiotyDao;
import com.wwsis.sos.model.Przedmioty;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class PrzedmiotyDaoImpl implements PrzedmiotyDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Przedmioty przedmiot) {
        entityManager.persist(przedmiot);
    }

    @Override
    public Przedmioty findById(int id) {
        return entityManager.find(Przedmioty.class, id);
    }

    @Override
    public List<Przedmioty> findAll() {
        return entityManager.createQuery("from Przedmioty", Przedmioty.class).getResultList();
    }

    @Override
    public void update(Przedmioty przedmiot) {
        entityManager.merge(przedmiot);
    }

    @Override
    public void delete(Przedmioty przedmiot) {
        entityManager.remove(entityManager.contains(przedmiot) ? przedmiot : entityManager.merge(przedmiot));
    }
}
