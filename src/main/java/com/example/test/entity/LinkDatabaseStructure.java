package com.example.test.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "link_database_structure")
public class LinkDatabaseStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String refcode;

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
}
