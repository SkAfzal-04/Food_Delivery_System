package com.code.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.api.entity.Payments;
@Repository
public interface PaymentReposatory extends JpaRepository<Payments, Integer> {
	
	
}
