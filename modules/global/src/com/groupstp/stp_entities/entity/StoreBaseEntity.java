package com.groupstp.stp_entities.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "STP_STORE", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_STP_STORE_UNQ", columnNames = {"EXT_ID"})
})
@Entity(name = "stp$Store")
public class StoreBaseEntity extends StandardEntity {
    private static final long serialVersionUID = -6710957140611836179L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 50)
    protected String name;

    @Column(name = "SORTING")
    protected Boolean sorting;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIVISION_ID")
    protected DivisionBaseEntity division;

    @Column(name = "EXT_ID")
    protected String extId;

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtId() {
        return extId;
    }

    public void setSorting(Boolean sorting) {
        this.sorting = sorting;
    }

    public Boolean getSorting() {
        return sorting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDivision(DivisionBaseEntity division) {
        this.division = division;
    }

    public DivisionBaseEntity getDivision() {
        return division;
    }
}