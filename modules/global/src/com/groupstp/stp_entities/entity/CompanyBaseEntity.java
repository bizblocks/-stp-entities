package com.groupstp.stp_entities.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Table(name = "STP_COMPANY", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_SUPPLY_COMPANY_UNQ", columnNames = {"EXT_ID"})
})
@Entity(name = "stp$Company")
public class CompanyBaseEntity extends BaseUuidEntity {
    private static final long serialVersionUID = -703335224563189337L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 100)
    protected String name;

    @Column(name = "POST_CODE")
    protected String postCode;

    @Column(name = "CEO_NAME")
    protected String ceoName;

    @Column(name = "ACCOUNTANT_NAME")
    protected String accountantName;

    @Column(name = "FULL_NAME")
    protected String fullName;

    @Column(name = "OFFICIAL_NAME")
    protected String officialName="";

    @NotNull
    @Column(name = "INN", nullable = false, length = 13)
    protected String inn="";

    @Column(name = "KPP", length = 13)
    protected String kpp="";

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "BILL")
    protected String bill;

    @Column(name = "COMPANY_RECIPIENT")
    protected String companyRecipient;

    @Column(name = "EXT_ID")
    protected String extId;

    @Email
    @Column(name = "EMAIL")
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtId() {
        return extId;
    }

    public void setCompanyRecipient(String companyRecipient) {
        this.companyRecipient = companyRecipient;
    }

    public String getCompanyRecipient() {
        return companyRecipient;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setAccountantName(String accountantName) {
        this.accountantName = accountantName;
    }

    public String getAccountantName() {
        return accountantName;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getBill() {
        return bill;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getKpp() {
        return kpp;
    }
}