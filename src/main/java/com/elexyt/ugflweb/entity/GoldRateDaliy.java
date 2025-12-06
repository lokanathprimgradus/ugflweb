package com.elexyt.ugflweb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * A GoldRateDaliy.
 */
@Data
@Entity
@Table(name = "gold_rate_daliy")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class GoldRateDaliy implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "gold_rate_daliy_id", nullable = false)
    private String goldRateDaliyId;

    @Column(name = "date")
    private LocalDate date;

    @NotNull
    @Column(name = "price_22k", nullable = false)
    private Double price22k;

    @NotNull
    @Column(name = "price_20k", nullable = false)
    private Double price20k;

    @NotNull
    @Column(name = "price_18k", nullable = false)
    private Double price18k;


    @NotNull
    @Column(name = "is_active", nullable = false, columnDefinition = "INTEGER DEFAULT 1")
    private Integer isActive;

    @Size(max = 100)
    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Size(max = 100)
    @Column(name = "modified_by", length = 100)
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;


}
