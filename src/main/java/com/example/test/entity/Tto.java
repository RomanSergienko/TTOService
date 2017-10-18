package com.example.test.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "tto")
public class Tto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String refcode;
    private Character dimen;
    @ManyToOne(optional = false)
    @JoinColumn(name = "ttdid")
    private Ttd ttd;
    @ManyToOne(optional = false)
    @JoinColumn(name="ttolibraryid")
    private Ttolibrary ttolibrary;
    private Integer ttcode;
    private Integer z;
    @ManyToOne(optional = false)
    @JoinColumn(name = "reprtypecode")
    private RefRepresentationType reprtype;
    private Integer fwc;
    @ManyToOne(optional = false)
    @JoinColumn(name = "structureid")
    private LinkDatabaseStructure structure;
    private Date created;
    private Short msrc;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getRefcode() {
        return refcode;
    }

    public void setRefcode(String refcode) {
        this.refcode = refcode;
    }

    public Character getDimen() {
        return dimen;
    }

    public void setDimen(Character dimen) {
        this.dimen = dimen;
    }

    public Ttd getTtd() {
        return ttd;
    }

    public void setTtd(Ttd ttd) {
        this.ttd = ttd;
    }

    public Ttolibrary getTtolibrary() {
        return ttolibrary;
    }

    public void setTtolibrary(Ttolibrary ttolibrary) {
        this.ttolibrary = ttolibrary;
    }

    public Integer getTtcode() {
        return ttcode;
    }

    public void setTtcode(Integer ttcode) {
        this.ttcode = ttcode;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public RefRepresentationType getReprtype() {
        return reprtype;
    }

    public void setReprtype(RefRepresentationType reprtype) {
        this.reprtype = reprtype;
    }

    public LinkDatabaseStructure getStructure() {
        return structure;
    }

    public void setStructure(LinkDatabaseStructure structure) {
        this.structure = structure;
    }

    public Integer getFwc() {
        return fwc;
    }

    public void setFwc(Integer fwc) {
        this.fwc = fwc;
    }



    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Short getMsrc() {
        return msrc;
    }

    public void setMsrc(Short msrc) {
        this.msrc = msrc;
    }
}
