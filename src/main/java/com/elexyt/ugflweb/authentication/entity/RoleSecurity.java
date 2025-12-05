package com.elexyt.ugflweb.authentication.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Table(name = "role_security")
@Data
@Entity
public class RoleSecurity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String roleId;
    private String roleName;
    @ManyToMany(mappedBy = "roleSecurity")
    private Set<com.elexyt.ugflweb.authentication.entity.Login> login;
}
