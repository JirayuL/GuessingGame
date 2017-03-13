package guessinggame;

import java.util.Random;

/**
 * Class for GuessingGame
 * 
 * @author Jirayu Laungwilawan
 * @version 20.1.16
 */

public class GuessingGame {
	private int upperBound;

	private int secret;
	private String hint;
	private int guesses;

	/**
	 * Initialize a new game.
	 * 
	 * @param uppperBound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) { // This is a constructor.
		newGame(upperBound);
	}

	/**
	 * Return upperBound.
	 * 
	 * @return Return upperBound.
	 */
	public int getUppperBound() {
		return upperBound;
	}

	/**
	 * Return guesses to tell user
	 * 
	 * @return guesses to tell user
	 */
	public int getGuess() {
		return guesses;
	}

	/**
	 * Set the difficult of the guessing game.
	 * 
	 * @param uppperBound
	 *            of the guessing game.
	 */
	public void setUpperBound(int uppperBound) {
		this.upperBound = uppperBound;
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
		}
		if (number < this.secret) {
			setHint("Sorry, your guess is too small");
			return false;
		}
		setHint("Correct. The secret is " + this.secret);
		return true;
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
	 * Set the guesses of GuessingGame.
	 * 
	 * @param Set
	 *            the value of guesses.
	 */
	public void setGuesses(int guesses) {
		this.guesses = guesses;
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

	public void newGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + this.upperBound;
		this.guesses = 0;
	}
}