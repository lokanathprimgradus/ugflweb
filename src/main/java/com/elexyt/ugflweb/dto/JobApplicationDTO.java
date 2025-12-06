package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.ugflweb.entity.JobApplication} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
@Data
public class JobApplicationDTO implements Serializable {

    @NotNull
    private String jobApplicationId;

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


}
