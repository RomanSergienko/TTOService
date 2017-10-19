package com.tto.project.dao;

import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by RomanDev on 19.10.2017.
 */
@Repository
public class TtoDAOHibernateImpl implements TtoDAO{
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Ttd> findTopology(String ttoid, Integer reprtypecode, List<String> refcodes) {
        return null;
    }

    @Override
    public List<Tto> findStuctures(String ttdUUID) {
        return null;
    }
}
