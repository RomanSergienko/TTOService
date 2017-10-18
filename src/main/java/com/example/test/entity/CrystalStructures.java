package com.example.test.entity;

import javax.persistence.*;
import java.sql.Date;
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
    private String cfStructural;
    private String cfSum;
    private String chemNameSystematic;
    private Date created;
    private String remark;
    private Date updated;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
