package org.example.individualproject.make.profile.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileUpdateDTO {
    private String userName;
    private String email;
    private String id;

}
