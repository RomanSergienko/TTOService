package com.tto.project.service;

import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;

import java.util.List;

/**
 * Created by RomanDev on 18.10.2017.
 */
public interface TtoService {
    List<Ttd> findTopology (String ttoid, Integer reprtypecode, List<String> refcodes);
    List<Tto> findStuctures(String ttdUUID);
}