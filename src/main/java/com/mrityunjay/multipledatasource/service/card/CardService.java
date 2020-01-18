package com.mrityunjay.multipledatasource.service.card;

import java.util.List;

import com.mrityunjay.multipledatasource.model.card.Card;

public interface CardService {
	
	public Card saveCard(Card card);
	public List<Card> getAllCard();
	
}
