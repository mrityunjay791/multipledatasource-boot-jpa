package com.mrityunjay.multipledatasource.repository.card;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mrityunjay.multipledatasource.model.card.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}