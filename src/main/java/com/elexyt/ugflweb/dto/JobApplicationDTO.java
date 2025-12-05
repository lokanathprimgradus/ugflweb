package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.domain.JobApplication} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class JobApplicationDTO implements Serializable {

    @NotNull
    private Long jobApplicationId;

    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String email;

    @Size(max = 255)
    private String city;

    @Size(max = 255)
    private String position;

    @NotNull
    private Double salary;

    @Size(max = 255)
    private String education;

    @Size(max = 255)
    private String experience;

    @Size(max = 255)
    private String coverLetter;

    @Size(max = 255)
    private String resumePath;

    @NotNull
    private Integer isActive;

    @Size(max = 100)
    private String createdBy;

    private LocalDate createdDate;

    @Size(max = 100)
    private String modifiedBy;

    private LocalDate modifiedDate;

    public Long getJobApplicationId() {
        return jobApplicationId;
    }

    public void setJobApplicationId(Long jobApplicationId) {
        this.jobApplicationId = jobApplicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
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
        if (!(o instanceof JobApplicationDTO)) {
            return false;
        }

        JobApplicationDTO jobApplicationDTO = (JobApplicationDTO) o;
        if (this.jobApplicationId == null) {
            return false;
        }
        return Objects.equals(this.jobApplicationId, jobApplicationDTO.jobApplicationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.jobApplicationId);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "JobApplicationDTO{" +
            "jobApplicationId=" + getJobApplicationId() +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", city='" + getCity() + "'" +
            ", position='" + getPosition() + "'" +
            ", salary=" + getSalary() +
            ", education='" + getEducation() + "'" +
            ", experience='" + getExperience() + "'" +
            ", coverLetter='" + getCoverLetter() + "'" +
            ", resumePath='" + getResumePath() + "'" +
            ", isActive=" + getIsActive() +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", modifiedBy='" + getModifiedBy() + "'" +
            ", modifiedDate='" + getModifiedDate() + "'" +
            "}";
    }
}
