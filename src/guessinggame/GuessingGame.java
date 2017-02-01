package guessinggame;

import java.util.Random;

/**
 * Class for GuessingGame
 * 
 * @author Jirayu Laungwilawan
 * @version 20.1.16
 */

public class GuessingGame {
	private int uppperBound;
	private int secret;
	private String hint;
	private int guesses;

	/**
	 * Return guesses to tell user
	 * 
	 * @return guesses to tell user
	 */
	public int getGuess() {
		return guesses;
	}

	/**
	 * Initialize a new game.
	 * 
	 * @param uppperBound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int uppperBound) { // This is a constructor.
		this.uppperBound = uppperBound;
		this.secret = getRandomNumber(10);
		this.hint = "I'm thinking of a number between 1 and " + uppperBound;
		this.guesses = 0;
	}

	/**
	 * Check the number with the secret.
	 * 
	 * @param number
	 *            receive from user.
	 * @return Is answer correct based on recent answer from user.
	 */
	public boolean guess(int number) {
		this.guesses++;
		if (number > this.secret) {
			setHint("Sorry, your guess is too large");
			return false;
		} else if (number < this.secret) {
			setHint("Sorry, your guess is too small");
			return false;
		} else {
			setHint("Correct. The secret is " + this.secret);
			return true;
		}
	}

	/**
	 * Set hint based on the most recent guess.
	 * 
	 * @param hint
	 *            based on most recent guess.
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess.
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number.
	 * @return a random number between 1 and limit (inclusive).
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Return a correct answer.
	 * 
	 * @return secret to show the correct answer.
	 */
	public int getSecret() {
		return secret;
	}
}