package com.example.mybatis.logUp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogUp {
    private int id;
    private String username;
    private String fullName;
    private LocalDate dateOfBirth;
    private String email;
    private String password;

}
