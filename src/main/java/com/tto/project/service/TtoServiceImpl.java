package com.tto.project.service;

import com.tto.project.dao.TtoDAO;
import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by RomanDev on 19.10.2017.
 */
@Service
public class TtoServiceImpl implements TtoService {
    private TtoDAO ttoDAO;
    @Autowired
    public void setTtoDAO(TtoDAO ttoDAO) {
        this.ttoDAO = ttoDAO;
    }

    @Transactional
    @Override
    public List<Ttd> findTopology(String ttoid, Integer reprtypecode, List<String> refcodes,Boolean isUsedLike) {
        return ttoDAO.findTopology(ttoid,reprtypecode,refcodes,isUsedLike);
    }
    @Transactional
    @Override
    public List<Tto> findStuctures(String ttdName) {
        return ttoDAO.findStuctures(ttdName);
    }
    @Transactional
    @Override
    public List<RefRepresentationType> findAllRefType() {
        return ttoDAO.findAllRefType();
    }
}
