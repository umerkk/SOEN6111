package Models;

import java.util.Observable;

public class GameEngine extends Observable {

	private Player humanPlayer;
	private Player computerPlayer;

	public GameEngine(Player humanPlayer, Player computerPlayer) {
		super();
		this.humanPlayer = humanPlayer;
		this.computerPlayer = computerPlayer;
	}

	public void startGame() {
		System.out.println("<Game Logging> : The Game is STARTED GOOD LUCK!");
		new Thread(new Runnable() {
			public void run() {

				while (true) {
					{
						humanPlayer.getCurrentPokemin().getStatus().turn();
						notifyObservers();
						humanPlayer.getCurrentPokemin().getStatus().turn();
						notifyObservers();
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
	}

}
