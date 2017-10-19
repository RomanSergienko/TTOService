package com.tto.project.entity;

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
    @Column
    private String refcode;
    @Column
    private Character dimen;
    @ManyToOne(optional = false)
    @JoinColumn(name = "ttdid")
    private Ttd ttd;
    @ManyToOne(optional = false)
    @JoinColumn(name="ttolibraryid")
    private Ttolibrary ttolibrary;
    @Column
    private Integer ttcode;
    @Column
    private Integer z;
    @ManyToOne(optional = false)
    @JoinColumn(name = "reprtypecode")
    private RefRepresentationType reprtype;
    @Column
    private Integer fwc;
    @ManyToOne(optional = false)
    @JoinColumn(name = "structureid")
    private CrystalStructures structure;
    @Column
    private Date created;
    @Column
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

    public CrystalStructures getStructure() {
        return structure;
    }

    public void setStructure(CrystalStructures structure) {
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

    public Tto() {
    }

    public Tto(String refcode, Character dimen, Ttd ttd, Ttolibrary ttolibrary, Integer ttcode, Integer z,
               RefRepresentationType reprtype, Integer fwc, CrystalStructures structure, Date created, Short msrc) {
        this.refcode = refcode;
        this.dimen = dimen;
        this.ttd = ttd;
        this.ttolibrary = ttolibrary;
        this.ttcode = ttcode;
        this.z = z;
        this.reprtype = reprtype;
        this.fwc = fwc;
        this.structure = structure;
        this.created = created;
        this.msrc = msrc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tto tto = (Tto) o;

        return id.equals(tto.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
