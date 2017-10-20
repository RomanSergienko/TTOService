package com.tto.project.dao;

import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by RomanDev on 19.10.2017.
 */
@Repository
@Transactional(readOnly = true)
public class TtoDAOHibernateImpl implements TtoDAO{
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Ttd> findTopology(String ttdname, Integer reprtypecode, List<String> refcodes, Boolean isUsedLike) {
        return null;
    }

    @Override
    public List<Tto> findStuctures(UUID ttdUUID) {
        return null;
    }

    @Override
    public List<RefRepresentationType> findAllRefType() {
        Session session = sessionFactory.getCurrentSession();
        List<RefRepresentationType> typeList = session.createCriteria(RefRepresentationType.class).list();
        return typeList;
    }
}
