package com.tto.project.service;

import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;

import java.util.List;

/**
 * Created by RomanDev on 18.10.2017.
 */
public interface TtoService {
    /**
     * Возращает список топологий
     * @param ttdname
     * @param reprtypecode
     * @param refcodes
     * @return
     */
    List<Ttd> findTopology (String ttdname, Integer reprtypecode, List<String> refcodes, Boolean isUsedLike);

    /**
     * Возращает список кодов материалов с данной топологией
     * @param ttdName
     * @return
     */
    List<Tto> findStuctures(String ttdName);

    /**
     * Возвращает все справочники
     * @return
     */
    List<RefRepresentationType> findAllRefType();
}
