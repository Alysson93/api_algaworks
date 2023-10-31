package com.example.api_algaworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_algaworks.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
