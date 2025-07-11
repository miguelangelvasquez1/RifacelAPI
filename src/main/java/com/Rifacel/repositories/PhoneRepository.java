package com.Rifacel.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rifacel.models.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, String> {
    List<Phone> findByStateTrue();
    List<Phone> findByMarkContainingIgnoreCase(String mark);
    List<Phone> findByVersionContainingIgnoreCase(String version);
}
