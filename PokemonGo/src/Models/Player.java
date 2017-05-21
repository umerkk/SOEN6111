package Models;

import java.util.ArrayList;

public class Player {

	private PokemonCard currentPokemin;
	private ArrayList<Card> cards = new ArrayList<>();

	public PokemonCard getCurrentPokemin() {
		return currentPokemin;
	}

	public void setCurrentPokemin(PokemonCard currentPokemin) {
		this.currentPokemin = currentPokemin;
	}

}
