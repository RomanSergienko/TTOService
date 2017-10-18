package com.tto.project.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "crystal_structures")
public class CrystalStructures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "cf_structural")
    private String cfStructural;
    @Column(name = "cf_sum")
    private String cfSum;
    @Column(name = "chem_name_systematic")
    private String chemNameSystematic;
    @Column
    private Timestamp created;
    @Column
    private String remark;
    @Column
    private Timestamp updated;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCfStructural() {
        return cfStructural;
    }

    public void setCfStructural(String cfStructural) {
        this.cfStructural = cfStructural;
    }

    public String getCfSum() {
        return cfSum;
    }

    public void setCfSum(String cfSum) {
        this.cfSum = cfSum;
    }

    public String getChemNameSystematic() {
        return chemNameSystematic;
    }

    public void setChemNameSystematic(String chemNameSystematic) {
        this.chemNameSystematic = chemNameSystematic;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}
