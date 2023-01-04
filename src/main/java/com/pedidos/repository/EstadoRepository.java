package com.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedidos.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
