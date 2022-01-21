package com.hcl.idao;

import java.util.List;

import com.hcl.cards.Card;

public interface ICardDao {
	public List<Card> getCards();
	public Card getCard(int id);
	public void addCard(Card card);
	public void deleteCard(Card card);
	public void updateCard(Card card);
}