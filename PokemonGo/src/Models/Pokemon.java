package Models;

import java.util.ArrayList;

import Strategies.Strategy;

public class Pokemon extends Card {

	private ArrayList<CardAbility> abilities = new ArrayList<CardAbility>();
	private int hitPoint;
	private boolean isActive = false;
	private Strategy status;

	public Pokemon(ArrayList<CardAbility> abilities, int hitPoint) {
		super();
		this.abilities = abilities;
		this.hitPoint = hitPoint;

	}

	public Strategy getStatus() {
		return status;
	}

	public void setStatus(Strategy status) {
		this.status = status;
	}

}
