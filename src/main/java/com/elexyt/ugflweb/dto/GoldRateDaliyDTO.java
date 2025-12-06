package com.elexyt.ugflweb.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A DTO for the {@link com.elexyt.ugflweb.entity.GoldRateDaliy} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
@Data
public class GoldRateDaliyDTO implements Serializable {

    @NotNull
    private String goldRateDaliyId;

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

    private LocalDateTime createdDate;

    @Size(max = 100)
    private String modifiedBy;

    private LocalDateTime modifiedDate;


}
