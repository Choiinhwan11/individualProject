package org.example.individualproject.make.profile.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Profile {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String userId;

    @Column(nullable = true)
    private String username;

    @Column(nullable = true)
    private String email;


}
