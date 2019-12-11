package com.groupstp.stp_entities.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "STP_DIVISION", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_STP_DIVISION_UNQ", columnNames = {"EXT_ID"})
})
@Entity(name = "stp$Division")
public class DivisionBaseEntity extends StandardEntity {
    private static final long serialVersionUID = -791602074170808116L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open", "clear"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COMPANY_ID")
    protected CompanyBaseEntity company;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 60)
    protected String name;

    @Column(name = "EXT_ID")
    protected String extId;

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtId() {
        return extId;
    }

    public void setCompany(CompanyBaseEntity company) {
        this.company = company;
    }

    public CompanyBaseEntity getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}