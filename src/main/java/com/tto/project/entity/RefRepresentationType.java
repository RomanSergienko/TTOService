package com.tto.project.entity;

import javax.persistence.*;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "ref_representation_type")
public class RefRepresentationType {
    @Id
    @Column(name = "rep_code")
    private Integer repCode;
    @Column(name = "rep_name")
    private String repName ;
    @Column(name = "rep_method")
    private Integer repMethod;

    public Integer getRepCode() {
        return repCode;
    }

    public void setRepCode(Integer repCode) {
        this.repCode = repCode;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public Integer getRepMethod() {
        return repMethod;
    }

    public void setRepMethod(Integer repMethod) {
        this.repMethod = repMethod;

    }

    public RefRepresentationType() {
    }

    public RefRepresentationType(Integer repCode, String repName, Integer repMethod) {
        this.repCode = repCode;
        this.repName = repName;
        this.repMethod = repMethod;
    }
}
