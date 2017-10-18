package com.example.test.service;

import com.example.test.entity.Ttd;
import com.example.test.entity.Tto;

import java.util.List;

/**
 * Created by RomanDev on 18.10.2017.
 */
public interface TtoService {
    List<Ttd> findTopology (String ttoid, Integer reprtypecode, List<String> refcodes);
    List<Tto> findStuctures(String ttdUUID);
}
