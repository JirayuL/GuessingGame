package guessinggame;

import java.util.Scanner;

/**
 * Class for GameConsole
 * 
 * @author Jirayu Laungwilawan
 * @version 20.1.16
 */
public class GameConsole {
	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game
	 *            receive uppperBound number
	 * @return secret number
	 */
	public int play(GuessingGame game) {
		Scanner input = new Scanner(System.in);
		String title = "Guessing Game";
		String promp = "Your guess?";
		int number;
		System.out.println(title);
		System.out.println(game.getHint());
		while (true) {
			System.out.println(promp);
			number = Integer.parseInt(input.nextLine());
			if (game.guess(number)) {
				System.out.println(game.getHint());
				break;
			}
			System.out.println(game.getHint());
		}
		System.out.println("You used " + game.getGuess() + " guesses.");
		return game.getSecret();
	}

	/** create object and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(10);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
