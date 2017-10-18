package com.tto.project.entity;

import javax.persistence.*;
import java.sql.Timestamp;
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
    @Column
    private String refcode;
    @ManyToOne(optional = false)
    @JoinColumn(name = "structure_id")
    private CrystalStructures crystalStructures;
    @ManyToOne(optional = false)
    @JoinColumn(name = "csd_id")
    private RefStructureDatabases refStructureDatabases;
    @Column
    private Timestamp created;

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

    public CrystalStructures getCrystalStructures() {
        return crystalStructures;
    }

    public void setCrystalStructures(CrystalStructures crystalStructures) {
        this.crystalStructures = crystalStructures;
    }

    public RefStructureDatabases getRefStructureDatabases() {
        return refStructureDatabases;
    }

    public void setRefStructureDatabases(RefStructureDatabases refStructureDatabases) {
        this.refStructureDatabases = refStructureDatabases;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
