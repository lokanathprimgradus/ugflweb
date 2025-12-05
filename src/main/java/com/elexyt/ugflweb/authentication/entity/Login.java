package com.elexyt.ugflweb.authentication.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "login_id")
    private String loginId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    @ManyToMany
    @JoinTable(
            name = "login_role_security",
            joinColumns = @JoinColumn(name = "loginId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    private Set<RoleSecurity> roleSecurity;

    private String name;
    private String email;
    private Long phone;
    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "is_active")
    private Integer isActive;

    public Integer getIsActive() {
        return isActive;
    }
}
