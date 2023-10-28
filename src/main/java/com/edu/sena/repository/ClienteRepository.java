package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.sena.models.entity.cliente;

@Repository
public interface ClienteRepository extends JpaRepository<cliente, Integer> {

}
