package com.elexyt.ugflweb.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidateOtpDto{
    private String newPassword;
    private String userName;
    private String otp;
}
