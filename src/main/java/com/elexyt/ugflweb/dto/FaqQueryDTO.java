package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.domain.FaqQuery} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class FaqQueryDTO implements Serializable {

    @NotNull
    private Long faqQueryId;

    @Size(max = 255)
    private String name;

    @NotNull
    private Long phone;

    private LocalDate patchDate;

    @Size(max = 255)
    private String subject;

    @Size(max = 255)
    private String message;

    @NotNull
    private Integer isActive;

    @Size(max = 100)
    private String createdBy;

    private LocalDate createdDate;

    @Size(max = 100)
    private String modifiedBy;

    private LocalDate modifiedDate;

    public Long getFaqQueryId() {
        return faqQueryId;
    }

    public void setFaqQueryId(Long faqQueryId) {
        this.faqQueryId = faqQueryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public LocalDate getPatchDate() {
        return patchDate;
    }

    public void setPatchDate(LocalDate patchDate) {
        this.patchDate = patchDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FaqQueryDTO)) {
            return false;
        }

        FaqQueryDTO faqQueryDTO = (FaqQueryDTO) o;
        if (this.faqQueryId == null) {
            return false;
        }
        return Objects.equals(this.faqQueryId, faqQueryDTO.faqQueryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.faqQueryId);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FaqQueryDTO{" +
            "faqQueryId=" + getFaqQueryId() +
            ", name='" + getName() + "'" +
            ", phone=" + getPhone() +
            ", patchDate='" + getPatchDate() + "'" +
            ", subject='" + getSubject() + "'" +
            ", message='" + getMessage() + "'" +
            ", isActive=" + getIsActive() +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", modifiedBy='" + getModifiedBy() + "'" +
            ", modifiedDate='" + getModifiedDate() + "'" +
            "}";
    }
}
