package com.example.treinamento_2.repository;

import com.example.treinamento_2.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Long> {
}
