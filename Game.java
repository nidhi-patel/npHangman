//===================================================
// Name              : Nidhi Patel
// SID               : 31379144
// Course            : IT114
// Section           : 452
// Instructor 	      : Maura Deek
// Assignment #      : Programming Assignment 3
// Date        	   :  03/25/2016
// Description       : This program is a Hangman game
//===================================================

import java.util.Random;
import java.lang.*;
import java.util.Arrays;

public class Game{

	int numWrongGuess,
		index;
	String words[] = {"PARIS", "LONDON","BANGKOK","SINGAPORE","DUBAI","ROME","TORONTO","MOSCOW","CHICAGO"};
	String[] lettersFound = {};
	char[] currentWordLetters;
	String currentWord ;
	Boolean gameOver = false;

	Random rand = new Random();

	public Game(){
		numWrongGuess = 0;
		index = rand.nextInt(words.length);
		currentWord = words[index];
		setCurrentWordLetters();
		setLettersFound();
	}

	public void setCurrentWordLetters()
	{
		currentWordLetters = new char[currentWord.length()];

		for(int i = 0; i < currentWord.length(); i++){
			currentWordLetters[i] = currentWord.charAt(i);
		}
	}

	public void setLettersFound()
	{
		lettersFound = new String[currentWord.length()];
	}

	public String getCurrentWord()
	{
		return currentWord;
	}

	public String getAsterisk()
	{
		String asterisk = "";

		for(int i = 0; i < currentWordLetters.length;i++){
			lettersFound[i] = "*";
			asterisk += "*";
		}
		return asterisk;
	}

	public String displayChar(String ch,char ch1)
	{
		char selectedChar = ch1;
		String selectedStr = ch;
		String returnWord = "";

		if(currentWord.contains(selectedStr)){
			for(int x = 0; x < currentWord.length(); x++){
				if(currentWordLetters[x] == selectedChar){
					lettersFound[x] = selectedStr;
				}
			}
		}
		else{
			numWrongGuess += 1;
		}

		for(int z = 0; z < lettersFound.length; z++){
				returnWord += lettersFound[z];
		}

		if(numWrongGuess == 6){
			returnWord = currentWord;
		}
		return returnWord;
	}

	public String displayHangman()
	{
		String displayMan = "";

		if(numWrongGuess == 1){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|             \n|          \n|         \n|      \n|_______";
		}
		else if (numWrongGuess == 2){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|         |   \n|          \n|         \n|      \n|_______";
		}
		else if (numWrongGuess == 3){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|        /|   \n|          \n|         \n|      \n|_______";
		}
		else if (numWrongGuess == 4){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|        /|\\ \n|          \n|         \n|      \n|_______";
		}
		else if (numWrongGuess == 5){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|        /|\\ \n|        / \n|         \n|      \n|_______";

		}
		else if (numWrongGuess == 6){
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|        O\n|        /|\\ \n|        / \\\n|         \n|      \n|_______\n Game Over! You Lose. Click New Game to play again.";
			gameOver = true;
		}
		else
		{
			displayMan  = "Category: Famous Cities\n_______\n|         |\n|         \n|             \n|          \n|         \n|      \n|_______";
		}

		if ((Arrays.asList(lettersFound).contains("*"))  == false){
			displayMan = "Category: Famous Cities\n_______\n|         |\n|         \n|             \n|          \n|         \n|      \n|_______\nYou Win! Click New Game to play again.";
		}

		return displayMan;
	}

	public void newGame()
	{
		numWrongGuess = 0;
		index = rand.nextInt(words.length);
		currentWord = words[index];
		setCurrentWordLetters();
		setLettersFound();
		gameOver = false;
	}
}