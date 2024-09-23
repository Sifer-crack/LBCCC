package com.lbccc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "administrators", schema = "lbccc_admin")
public class Administrator {
    @Id
    @Column(name = "admin_id", nullable = false, length = 50)
    private String adminId;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "salt", nullable = false)
    private String salt;

    @Lob
    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "permissions", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> permissions;

}