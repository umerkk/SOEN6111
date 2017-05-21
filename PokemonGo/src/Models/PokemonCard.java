package Models;

import Enums.CardCategory;
import Enums.CardType;
import Strategies.Strategy;

public class PokemonCard extends Card {

	// private ArrayList<CardAbility> abilities = new ArrayList<CardAbility>();
	private final int HP;
	private final int attackHit1;
	private final int attackHit2;
	private final int attackHit3;
	private final int attackHit4;
	private int hitPoint;
	private boolean isActive = false;
	private Strategy status;

	public PokemonCard(int HP, String name, int attackHit1, int attackHit2, int attackHit3, int attackHit4) {
		super(name, CardType.Pokemon, CardCategory.Basic);
		this.HP = HP;
		this.hitPoint = HP;
		this.attackHit1 = attackHit1;
		this.attackHit2 = attackHit2;
		this.attackHit3 = attackHit3;
		this.attackHit4 = attackHit4;

	}

	/**
	 * the user can apply which attack they can apply into target Pokemon will
	 * check if the Pokemon is evloved to stage-one
	 * 
	 * @param attackKind
	 *            = what kind of attack it will be
	 * @param pokemonTarget
	 */

	public void attack(int attackKind, PokemonCard pokemonTarget) {

		int damegAfterHit;
		if (super.getCardCategory().equals(CardCategory.Basic)) {
			switch (attackKind) {
			case 1:
				damegAfterHit = pokemonTarget.getHitPoint() - this.getAttackHit1();
				pokemonTarget.setHitPoint(damegAfterHit);
				break;

			case 2:
				if (validateAttackExist(attackHit2) == false) {
					break;
				} //
				damegAfterHit = pokemonTarget.getHitPoint() - this.getAttackHit2();
				pokemonTarget.setHitPoint(damegAfterHit);
				break;
			}
		}
		if (super.getCardCategory().equals(CardCategory.StageOne)) {
			switch (attackKind) {
			case 1:
				damegAfterHit = pokemonTarget.getHitPoint() - this.getAttackHit3();
				pokemonTarget.setHitPoint(damegAfterHit);
				break;

			case 2:
				damegAfterHit = pokemonTarget.getHitPoint() - this.getAttackHit4();
				pokemonTarget.setHitPoint(damegAfterHit);
				break;
			}
		}
	}

	public boolean validateAttackExist(int attackHit) {
		if (attackHit == 0) {
			return false;
		}
		return true;
	}

	public int getHitPoint() {
		return hitPoint;
	}

	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Strategy getStatus() {
		return status;
	}

	public void setStatus(Strategy status) {
		this.status = status;
	}

	public int getHP() {
		return HP;
	}

	public int getAttackHit1() {
		return attackHit1;
	}

	public int getAttackHit2() {
		return attackHit2;
	}

	public int getAttackHit3() {
		return attackHit3;
	}

	public int getAttackHit4() {
		return attackHit4;
	}

}
