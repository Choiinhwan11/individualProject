package org.example.individualproject.make.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter

public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_name",nullable = false)
    private String username;

    @Column(name = "user_id", nullable = false,unique = true)
    private String userId;

    @Column(name = "user_password", nullable = false)
    private String password;

    @Column(name = "user_email", nullable = false)
    private String email;

    @Column(name = "user_phone", nullable = false)
    private Long phone;

    @Column(name ="sex" ,nullable = false)
    private int sex ;

    @Column(name = "goal" ,nullable = false)
    private int goal;
}
