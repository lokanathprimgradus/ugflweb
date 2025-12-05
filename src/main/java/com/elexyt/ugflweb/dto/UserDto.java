package com.elexyt.ugflweb.dto;

import lombok.Data;

@Data
public class UserDto {
    private String loginId;
    private String username;
    private String password;
    private String name;
    private String email;
    private Long phone;
    private String actionType;
}
