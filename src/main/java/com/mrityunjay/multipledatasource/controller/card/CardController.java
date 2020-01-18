package com.mrityunjay.multipledatasource.controller.card;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.multipledatasource.model.card.Card;
import com.mrityunjay.multipledatasource.service.card.CardService;

@RestController
@RequestMapping("/card")
public class CardController {

	@Autowired
	private CardService cardService;
	
	
	@GetMapping("/list")
	public List<Card> getAllCard() {
		return cardService.getAllCard();
	}
	
	@PostMapping("/save")
	public Card saveCard(@RequestBody Card card) {
		return cardService.saveCard(card);
	}
}
