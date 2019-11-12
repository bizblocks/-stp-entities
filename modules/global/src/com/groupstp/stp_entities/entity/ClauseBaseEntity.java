package com.groupstp.stp_entities.entity;

import com.haulmont.cuba.core.entity.BaseUuidEntity;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "STP_CLAUSE", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_STP_CLAUSE_UNQ", columnNames = {"EXT_ID"})
})
@Entity(name = "stp$Clause")
public class ClauseBaseEntity extends StandardEntity {
    private static final long serialVersionUID = -5642341102420647383L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false)
    private String number;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "COMMENT_")
    private String comment;

    @Column(name = "APPROVE_REQUIRED")
    private Boolean approveRequired = false;

    @Min(1)
    @Max(31)
    @Column(name = "PAYMENT_DUE_MONTH_DAY")
    private Integer paymentDueMonthDay;

    @Column(name = "EXT_ID")
    protected String extId;

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtId() {
        return extId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getApproveRequired() {
        return approveRequired;
    }

    public void setApproveRequired(Boolean approveRequired) {
        this.approveRequired = approveRequired;
    }

    public Integer getPaymentDueMonthDay() {
        return paymentDueMonthDay;
    }

    public void setPaymentDueMonthDay(Integer paymentDueMonthDay) {
        this.paymentDueMonthDay = paymentDueMonthDay;
    }
}