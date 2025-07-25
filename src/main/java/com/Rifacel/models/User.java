package com.Rifacel.models;

import java.time.LocalDateTime;

import com.Rifacel.security.auth.UserRegisterRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String lastNames;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    private String department;

    private String municipality;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false) //implementar seguridad con Json ignore
    private String password;

    private LocalDateTime registeredDate;

    public User(UserRegisterRequest userRegisterRequest) {
        this.name = userRegisterRequest.getName();
        this.email = userRegisterRequest.getEmail();
        this.phoneNumber = userRegisterRequest.getPhoneNumber();
        this.department = userRegisterRequest.getDepartment();
        this.municipality = userRegisterRequest.getMunicipality();
        this.address = userRegisterRequest.getAddress();
        this.password = userRegisterRequest.getPassword(); // Encriptar la contraseña en el futuro
        this.registeredDate = LocalDateTime.now();
    }
}

