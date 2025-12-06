package com.elexyt.ugflweb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "validate_otp")
@Where(clause = "isActive =1")
public class ValidateOtp {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String otpId;
    private String userName;
    private String otp;
    @NotNull
    @Column(nullable = false, columnDefinition = "INTEGER DEFAULT 1")
    private int isActive;

}
