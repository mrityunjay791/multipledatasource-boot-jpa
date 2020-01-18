package com.mrityunjay.multipledatasource.repository.cardholder;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.multipledatasource.model.cardholder.CardHolder;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
	
}