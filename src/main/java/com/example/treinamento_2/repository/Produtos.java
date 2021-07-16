package com.example.treinamento_2.repository;

import com.example.treinamento_2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {

}
