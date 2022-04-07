package com.example.springsecurity.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppUser {
    private Long userId;
    private String userName;
    private String encrytedPassword;
}
