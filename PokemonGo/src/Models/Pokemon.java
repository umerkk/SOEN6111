package Models;

import java.util.ArrayList;

import Enums.CardCategory;
import Enums.CardType;

public class Pokemon extends Card {

	
	private ArrayList<CardAbility> abilities  = new ArrayList<CardAbility>();
	private int hitPoint;
	private boolean isActive = false;
	
	
	
	
	public Pokemon(String name, CardType cardType, CardCategory cardCategory, int hitPoint)
	{
		
	}
	
}
