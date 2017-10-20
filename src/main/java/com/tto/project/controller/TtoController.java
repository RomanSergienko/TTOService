package com.tto.project.controller;

import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import com.tto.project.service.TtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * Created by RomanDev on 19.10.2017.
 */
@RestController
public class TtoController {
    @Autowired
    TtoService ttoService;

    @RequestMapping(value = "/ttd", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ttd>> listTtd(@PathVariable("ttoid") UUID ttoid,
                                             @PathVariable("reprtypecode")Integer reprtypecode,
                                             @PathVariable("refcodes")List<String> refcodes){
        List<Ttd> ttdList = ttoService.findTopology(ttoid, reprtypecode, refcodes);
        return new ResponseEntity<List<Ttd>>(ttdList, HttpStatus.OK);
    }

    @RequestMapping(value = "/tto", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tto>> listTto(@PathVariable("ttdUUID")UUID ttdUUID){
        List<Tto> ttoList = ttoService.findStuctures(ttdUUID);
        return new ResponseEntity<List<Tto>>(ttoList,HttpStatus.OK);
    }
}
