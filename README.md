# Hangman Game

A classic command-line Hangman game implemented in Java.

## About This Project

This project was originally created for **AP Computer Science A**, taught by **Mrs. Mousumi Chatterjee**.

## Description

Hangman is a word-guessing game where the player attempts to guess a hidden word one letter at a time. For each incorrect guess, a part of the hangman figure is drawn. The player wins by guessing all the letters in the word before the hangman is fully drawn (6 wrong guesses).

## Features

- Interactive command-line gameplay
- Visual ASCII art hangman display that updates with each wrong guess
- Word bank containing programming-related terms
- Tracks guessed letters to prevent duplicate guesses
- Option to play multiple rounds
- Win/loss detection with appropriate messages

## Project Structure

```
src/main/java/
├── Main.java           - Entry point; handles game loop and replay functionality
├── HangmanGame.java    - Core game logic; manages guesses, game state, and win conditions
├── HangmanDisplay.java - ASCII art display for the hangman figure (7 stages)
└── WordBank.java       - Stores and provides random words for the game
```

## How to Play

1. Run the program
2. A random word will be selected from the word bank
3. Guess letters one at a time by typing a single letter and pressing Enter
4. Correct guesses reveal the letter(s) in the word
5. Incorrect guesses add a body part to the hangman
6. Win by guessing all letters before making 6 wrong guesses
7. After each game, choose whether to play again

## Word Bank

The game includes programming-themed words such as:
- JAVA, PROGRAMMING, COMPUTER
- ALGORITHM, VARIABLE, FUNCTION
- ARRAYLIST, CONSTRUCTOR, METHOD
- CLASS, OBJECT, INHERITANCE
- And more!

## Running the Project

Compile and run using Maven:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="Main"
```

Or compile directly with javac:
```bash
javac src/main/java/*.java
java -cp src/main/java Main
```

## Author

Created as a class project for AP Computer Science A
