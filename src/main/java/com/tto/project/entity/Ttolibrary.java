package com.tto.project.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

/**
 * Created by RomanDev on 17.10.2017.
 */
@Entity
@Table(schema = "public", name = "ttolibrary")
public class Ttolibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String name;
    @Column
    private Date created;
    @Column
    private String user;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user1) {
        this.user = user1;
    }
}
