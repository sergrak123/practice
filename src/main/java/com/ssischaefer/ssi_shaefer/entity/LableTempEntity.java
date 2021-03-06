package com.ssischaefer.ssi_shaefer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LableTempEntity {
    @Id
    private Long id;
    private String name;
    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LableTempEntity(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }



    public LableTempEntity() {

    }
}
