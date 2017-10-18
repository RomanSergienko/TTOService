package com.example.test.entity;

import javax.persistence.*;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "ref_representation_type")
public class RefRepresentationType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String repCode;
    private Integer repMethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRepCode() {
        return repCode;
    }

    public void setRepCode(String repCode) {
        this.repCode = repCode;
    }

    public Integer getRepMethod() {
        return repMethod;
    }

    public void setRepMethod(Integer repMethod) {
        this.repMethod = repMethod;
    }
}
