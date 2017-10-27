package com.tto.project.dao;

import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

        Session session = sessionFactory.getCurrentSession();
        Criteria cr = session.createCriteria(Ttd.class,"td");


        if (!ttdname.isEmpty() || !ttdname.equals("")){
            if (isUsedLike){
                cr.add(Restrictions.like("name","%"+ttdname+"%"));
            }else {
                cr.add(Restrictions.eq("name",ttdname));
            }

        }
        if (reprtypecode!=null || !refcodes.isEmpty()){

        }
        //by refcode and ttdname
        //select * from ttd join tto on ttd.id=tto.ttdid where ttd.name like ttdname and tto.refcode=refcodes
        // by tto.reprtypecode
        //select * from ttd  join tto on ttd.id = tto.ttid left join ref_representation_type
        // on tto.reprtyprcode=ref_representation_type.id

        List result = cr.list();
        return result;
    }

    @Override
    public List<Tto> findStuctures(UUID ttdUUID) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Tto.class);
        criteria.add(Restrictions.eq("ttdid",ttdUUID));
        List<Tto> result = criteria.list();
        return result;
    }

    @Override
    public List<RefRepresentationType> findAllRefType() {
        Session session = sessionFactory.getCurrentSession();
        List<RefRepresentationType> typeList = session.createCriteria(RefRepresentationType.class).list();
//        Ttd ttd = new Ttd();
//        ttd.setId(UUID.randomUUID());
//        ttd.setName("diamond");
//        ttd.setTtdcode(10);
//        ttd.setTs("Строка");
//        ttd.setNumnodes(111);
//        ttd.setCreated(new Timestamp(Calendar.getInstance().getTimeInMillis()));
//        ttd.setUpdated(new Timestamp(Calendar.getInstance().getTimeInMillis()));
//        session.save(ttd);
        return typeList;
    }
}
