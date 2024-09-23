package com.lbccc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "users", schema = "lbccc_clubmembers")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "school_id")
    private Integer schoolId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @ColumnDefault("'Member'")
    @Lob
    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "profilePictureURL", length = 45)
    private String profilePictureURL;

    @Column(name = "dateOfBirth", nullable = false)
    private LocalDate dateOfBirth;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "lastLogin", nullable = false)
    private Instant lastLogin;

}