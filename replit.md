# Hangman Game

## Overview
A command-line Hangman game written in Java, originally created as a project for AP Computer Science A (taught by Mrs. Mousumi Chatterjee).

## Project Structure
```
src/main/java/
├── Main.java           - Entry point and game replay loop
├── HangmanGame.java    - Core game logic and state management
├── HangmanDisplay.java - ASCII art hangman visualization
└── WordBank.java       - Word storage and random selection
```

## Running the Project
The project is configured to compile and run via the "Hangman Game" workflow, which executes:
```bash
cd src/main/java && javac *.java && java Main
```

## Game Rules
- Player guesses letters to reveal a hidden word
- 6 wrong guesses allowed before game over
- Programming-themed word bank

## Technologies
- Java 21
- Maven (pom.xml for dependencies)
