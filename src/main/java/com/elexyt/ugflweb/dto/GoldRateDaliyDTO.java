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


    private String goldRateDaliyId;
    @NotNull
    private LocalDate date;

    @NotNull
    private Double price22k;

    @NotNull
    private Double price20k;

    @NotNull
    private Double price18k;


}
