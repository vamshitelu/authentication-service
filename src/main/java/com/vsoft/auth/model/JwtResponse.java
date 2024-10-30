package com.vsoft.auth.model;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class JwtResponse {

    private String jwtToken;
    private String username;
    private List<String> roles;
}
