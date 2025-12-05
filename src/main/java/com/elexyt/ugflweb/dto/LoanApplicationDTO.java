package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.domain.LoanApplication} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class LoanApplicationDTO implements Serializable {

    @NotNull
    private Long loanApplicationId;

    @Size(max = 255)
    private String name;

    @NotNull
    private Long phone;

    @NotNull
    private Integer goldPurity;

    @NotNull
    private Integer weight;

    @Size(max = 255)
    private String address;

    @NotNull
    private Integer isActive;

    @Size(max = 100)
    private String createdBy;

    private LocalDate createdDate;

    @Size(max = 100)
    private String modifiedBy;

    private LocalDate modifiedDate;

    public Long getLoanApplicationId() {
        return loanApplicationId;
    }

    public void setLoanApplicationId(Long loanApplicationId) {
        this.loanApplicationId = loanApplicationId;
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

    public Integer getGoldPurity() {
        return goldPurity;
    }

    public void setGoldPurity(Integer goldPurity) {
        this.goldPurity = goldPurity;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        if (!(o instanceof LoanApplicationDTO)) {
            return false;
        }

        LoanApplicationDTO loanApplicationDTO = (LoanApplicationDTO) o;
        if (this.loanApplicationId == null) {
            return false;
        }
        return Objects.equals(this.loanApplicationId, loanApplicationDTO.loanApplicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.loanApplicationId);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "LoanApplicationDTO{" +
            "loanApplicationId=" + getLoanApplicationId() +
            ", name='" + getName() + "'" +
            ", phone=" + getPhone() +
            ", goldPurity=" + getGoldPurity() +
            ", weight=" + getWeight() +
            ", address='" + getAddress() + "'" +
            ", isActive=" + getIsActive() +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", modifiedBy='" + getModifiedBy() + "'" +
            ", modifiedDate='" + getModifiedDate() + "'" +
            "}";
    }
}
