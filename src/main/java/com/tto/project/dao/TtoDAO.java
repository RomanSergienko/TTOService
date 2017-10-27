package com.tto.project.dao;

import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;

import java.util.List;

/**
 * Created by RomanDev on 18.10.2017.
 */
public interface TtoDAO {
    List<Ttd> findTopology (String ttdname, Integer reprtypecode, List<String> refcodes,Boolean isUsedLike);
    List<Tto> findStuctures(String ttdName);
    List<RefRepresentationType> findAllRefType();

}
