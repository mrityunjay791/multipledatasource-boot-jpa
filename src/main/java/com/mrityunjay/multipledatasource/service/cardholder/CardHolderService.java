package com.mrityunjay.multipledatasource.service.cardholder;

import java.util.List;

import com.mrityunjay.multipledatasource.model.cardholder.CardHolder;

public interface CardHolderService {
	public CardHolder saveCardHolder(CardHolder cardHolder);
	public List<CardHolder> getAllCardHolder();
}
