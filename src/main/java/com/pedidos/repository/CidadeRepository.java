package com.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pedidos.model.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
