package com.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurante.model.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Long> {
	
}
