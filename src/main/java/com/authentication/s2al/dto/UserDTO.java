package com.authentication.s2al.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {

    private String username;
    private String password;
    private String fullName;
    private Date dateOfBirth;
    private Date dateOfSubmission;
    private String phoneNumber;
    private String email;

}
