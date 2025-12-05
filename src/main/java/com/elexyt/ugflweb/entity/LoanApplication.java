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
 * A LoanApplication.
 */
@Data
@Entity
@Table(name = "loan_application")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class LoanApplication implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "loan_application_id", nullable = false)
    private String loanApplicationId;

    @Size(max = 255)
    @Column(name = "name", length = 255)
    private String name;

    @NotNull
    @Column(name = "phone", nullable = false)
    private Long phone;

    @NotNull
    @Column(name = "gold_purity", nullable = false)
    private Integer goldPurity;

    @NotNull
    @Column(name = "weight", nullable = false)
    private Integer weight;

    @Size(max = 255)
    @Column(name = "address", length = 255)
    private String address;

    @NotNull
    @Column(name = "is_active", nullable = false)
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
