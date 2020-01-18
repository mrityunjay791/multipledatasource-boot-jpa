package com.mrityunjay.multipledatasource.model.cardholder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CardHolder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String memberId;
	private String cardNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "CardHolder [id=" + id + ", memberId=" + memberId + ", cardNumber=" + cardNumber + "]";
	}

}