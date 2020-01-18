package com.mrityunjay.multipledatasource.service.card;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrityunjay.multipledatasource.model.card.Card;
import com.mrityunjay.multipledatasource.repository.card.CardRepository;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public Card saveCard(Card card) {
		return cardRepository.save(card);
	}

	@Override
	public List<Card> getAllCard() {
		return cardRepository.findAll();
	}

}
