package com.vsoft.auth.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private Long id;
    private String username;
    private String password;
    private String email;
}
