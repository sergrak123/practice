package com.ssischaefer.ssi_shaefer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LocationEntity {
    @Id
    private Long id;
    private String name;
    private Long connectedId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getConnectedId() {
        return connectedId;
    }

    public void setConnectedId(Long connectedId) {
        this.connectedId = connectedId;
    }

    public LocationEntity(Long id, String name, Long connectedId) {
        this.id = id;
        this.name = name;
        this.connectedId = connectedId;
    }

    public LocationEntity() {

    }
}
