package Models;

import Enums.CardCategory;
import Enums.CardType;

public abstract class Card {

	private String name;
	private CardType cardType;
	private CardCategory cardCategory;

	protected Card(String name, CardType cardType, CardCategory cardCategory) {
		this.name = name;
		this.cardType = cardType;
		this.cardCategory = cardCategory;
	}

	public String getName() {
		return name;
	}

	public CardType getCardType() {
		return cardType;
	}

	public CardCategory getCardCategory() {
		return cardCategory;
	}

	public void setCardCategory(CardCategory cardCategory) {
		this.cardCategory = cardCategory;
	}

}
