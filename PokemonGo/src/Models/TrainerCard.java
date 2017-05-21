package Models;

import java.util.ArrayList;

import Enums.CardCategory;
import Enums.CardType;

public class TrainerCard extends Card {

	protected TrainerCard(String name, CardType cardType, CardCategory cardCategory) {
		super(name, CardType.Trainer, cardCategory);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<CardAbility> abilities = new ArrayList<CardAbility>();

}
