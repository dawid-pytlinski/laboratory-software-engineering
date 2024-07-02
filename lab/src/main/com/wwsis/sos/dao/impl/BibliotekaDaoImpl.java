package com.wwsis.sos.dao.impl;

import com.wwsis.sos.dao.BibliotekaDao;
import com.wwsis.sos.model.Ksiazka;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class BibliotekaDaoImpl implements BibliotekaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Ksiazka ksiazka) {
        entityManager.persist(ksiazka);
    }

    @Override
    public Ksiazka findById(int id) {
        return entityManager.find(Ksiazka.class, id);
    }

    @Override
    public List<Ksiazka> findAll() {
        return entityManager.createQuery("from Ksiazka", Ksiazka.class).getResultList();
    }

    @Override
    public void update(Ksiazka ksiazka) {
        entityManager.merge(ksiazka);
    }

    @Override
    public void delete(Ksiazka ksiazka) {
        entityManager.remove(entityManager.contains(ksiazka) ? ksiazka : entityManager.merge(ksiazka));
    }
}
