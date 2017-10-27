package com.tto.project.controller;

import com.tto.project.entity.RefRepresentationType;
import com.tto.project.entity.Ttd;
import com.tto.project.entity.Tto;
import com.tto.project.service.TtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by RomanDev on 19.10.2017.
 */
@RestController
public class TtoController {
    @Autowired
    TtoService ttoService;

    @RequestMapping(value = "/ttd", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Ttd>> listTtd(@RequestParam("ttdname") String ttdname,
                                             @RequestParam("reprtypecode")Integer reprtypecode,
                                             @RequestParam("refcodes")List<String> refcodes,
                                             @RequestParam("like")Boolean isUsedLike){
        List<Ttd> ttdList = ttoService.findTopology(ttdname, reprtypecode, refcodes,isUsedLike);
        return new ResponseEntity<List<Ttd>>(ttdList, HttpStatus.OK);
    }

    @RequestMapping(value = "/tto", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Tto>> listTto(@RequestParam("ttdName")String ttdName){
        List<Tto> ttoList = ttoService.findStuctures(ttdName);
        return new ResponseEntity<List<Tto>>(ttoList,HttpStatus.OK);
    }

    @RequestMapping(value = "/repres", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RefRepresentationType>> listRepresentationType(){
        List<RefRepresentationType> repTypeList = ttoService.findAllRefType();
        return new ResponseEntity<List<RefRepresentationType>>(repTypeList,HttpStatus.OK);
    }
}
