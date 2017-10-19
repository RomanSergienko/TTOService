package com.tto.project.service;

import com.tto.project.dao.TtoDAO;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by RomanDev on 19.10.2017.
 */
public class TtoServiceImpl implements TtoService {
    private TtoDAO ttoDAO;
    @Autowired
    public void setTtoDAO(TtoDAO ttoDAO) {
        this.ttoDAO = ttoDAO;
    }

    @Override
    public List<Ttd> findTopology(String ttoid, Integer reprtypecode, List<String> refcodes) {
        return ttoDAO.findTopology(ttoid,reprtypecode,refcodes);
    }

    @Override
    public List<Tto> findStuctures(String ttdUUID) {
        return ttoDAO.findStuctures(ttdUUID);
    }
}
