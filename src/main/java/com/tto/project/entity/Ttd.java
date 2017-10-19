package com.tto.project.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "ttd")
public class Ttd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @Column
    private Integer ttdcode;
    @Column
    private String ts;
    @Column
    private Integer numnodes;
    @Column
    private Timestamp updated;
    @Column
    private Timestamp created;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTtdcode() {
        return ttdcode;
    }

    public void setTtdcode(Integer ttdcode) {
        this.ttdcode = ttdcode;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public Integer getNumnodes() {
        return numnodes;
    }

    public void setNumnodes(Integer numnodes) {
        this.numnodes = numnodes;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Ttd() {
    }

    public Ttd(String name, Integer ttdcode, String ts, Integer numnodes, Timestamp updated, Timestamp created) {
        this.name = name;
        this.ttdcode = ttdcode;
        this.ts = ts;
        this.numnodes = numnodes;
        this.updated = updated;
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ttd ttd = (Ttd) o;

        return id.equals(ttd.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
