package com.ssischaefer.ssi_shaefer.entity;

import javax.persistence.*;

@Entity
@Table//(name = "Printer")
public class PrinterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long labelTemplateId;
    private Long locationId;

    public PrinterEntity(Long id, String name, Long labelTemplateId, Long locationId) {
        this.id = id;
        this.name = name;
        this.labelTemplateId = labelTemplateId;
        this.locationId = locationId;
    }

    public PrinterEntity() {

    }

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

    public Long getLabelTemplateId() {
        return labelTemplateId;
    }

    public void setLabelTemplateId(Long labelTemplateId) {
        this.labelTemplateId = labelTemplateId;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
