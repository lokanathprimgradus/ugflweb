package com.elexyt.ugflweb.authentication.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_security")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	 private String roleId;
	 private String roleName;


   
    
}
