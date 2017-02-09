# GuessingGame
* Jirayu Laungwilawan 5910546635
* This repository contains GameConsole.java and GuessingGame.java.

## GameConsole.java
* play()
  * Show the title of the game.
  * Show hint of the game.
  * Prompt the user for the guess.
  * Send input to GuessingGame.
  * Show hint from GuessingGame.
  * If user guess correct, print getGuess from GuessingGame.
* main()
  * Create new GuessingGame and send Secret.
  * Create new GameConsole.
  * Play the game.

## GuessingGame.java
* getGuess()
  * Return guesses.
* GuessingGame()
  * Set initial value of attribute.
* guess()
  * Increase guess.
  * Set hint depends on the user answer.
  * Return whether answer is true or false.
* setHint()
  * Set hint.
* getHint()
  * Return hint.
* getRandomNumber()
  * Random number and keep it in rand.
  * Return random number.
* getSecret()
  * Return Secret.
