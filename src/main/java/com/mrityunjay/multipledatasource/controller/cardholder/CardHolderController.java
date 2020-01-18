package com.mrityunjay.multipledatasource.controller.cardholder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrityunjay.multipledatasource.model.cardholder.CardHolder;
import com.mrityunjay.multipledatasource.service.cardholder.CardHolderService;

@RestController
@RequestMapping("/cardholder")
public class CardHolderController {
	
	@Autowired
	private CardHolderService cardHolderService;

	@GetMapping("/list")
	public List<CardHolder> getAllCardHolder() {
		return cardHolderService.getAllCardHolder();
	}

	@PostMapping("/save")
	public CardHolder saveCardHolder(@RequestBody CardHolder cardHolder) {
		return cardHolderService.saveCardHolder(cardHolder);
	}

}
