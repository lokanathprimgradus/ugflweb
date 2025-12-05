package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.domain.GoldRateDaliy} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class GoldRateDaliyDTO implements Serializable {

    @NotNull
    private Long goldRateDaliyId;

    private LocalDate date;

    @NotNull
    private Double price22k;

    @NotNull
    private Double price20k;

    @NotNull
    private Double price18k;

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

    public Long getGoldRateDaliyId() {
        return goldRateDaliyId;
    }

    public void setGoldRateDaliyId(Long goldRateDaliyId) {
        this.goldRateDaliyId = goldRateDaliyId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice22k() {
        return price22k;
    }

    public void setPrice22k(Double price22k) {
        this.price22k = price22k;
    }

    public Double getPrice20k() {
        return price20k;
    }

    public void setPrice20k(Double price20k) {
        this.price20k = price20k;
    }

    public Double getPrice18k() {
        return price18k;
    }

    public void setPrice18k(Double price18k) {
        this.price18k = price18k;
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
        if (!(o instanceof GoldRateDaliyDTO)) {
            return false;
        }

        GoldRateDaliyDTO goldRateDaliyDTO = (GoldRateDaliyDTO) o;
        if (this.goldRateDaliyId == null) {
            return false;
        }
        return Objects.equals(this.goldRateDaliyId, goldRateDaliyDTO.goldRateDaliyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.goldRateDaliyId);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "GoldRateDaliyDTO{" +
            "goldRateDaliyId=" + getGoldRateDaliyId() +
            ", date='" + getDate() + "'" +
            ", price22k=" + getPrice22k() +
            ", price20k=" + getPrice20k() +
            ", price18k=" + getPrice18k() +
            ", message='" + getMessage() + "'" +
            ", isActive=" + getIsActive() +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", modifiedBy='" + getModifiedBy() + "'" +
            ", modifiedDate='" + getModifiedDate() + "'" +
            "}";
    }
}
