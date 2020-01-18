package com.mrityunjay.multipledatasource.service.cardholder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrityunjay.multipledatasource.model.cardholder.CardHolder;
import com.mrityunjay.multipledatasource.repository.cardholder.CardHolderRepository;

@Service
public class CardHolderServiceImpl implements CardHolderService {
	
	@Autowired
	private CardHolderRepository cardHolderRepository;

	@Override
	public CardHolder saveCardHolder(CardHolder cardHolder) {
		return cardHolderRepository.save(cardHolder);
	}

	@Override
	public List<CardHolder> getAllCardHolder() {
		return cardHolderRepository.findAll();
	}

}
