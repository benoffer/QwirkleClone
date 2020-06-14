package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class GamePieces {

	private Stack<String> gamePieces = new Stack<>();
	private ArrayList<String> player1Hand = new ArrayList<>();
	private ArrayList<String> player2Hand = new ArrayList<>();

	private String[] colors = new String[] { "Blue", "Yellow", "Green", "Purple", "Orange", "White" };
	private String[] shapes = new String[] { "Star", "Circle", "Triangle", "Square", "Diamond", "Horseshoe" };

	public GamePieces() {

		Stack<String> gamePieces = new Stack<>();

		for (int c = 0; c < colors.length; c++) {
			for (int s = 0; s < colors.length; s++) {
				for (int n = 0; n < 3; n++) {
					gamePieces.push(colors[c] + "|" + shapes[s]);
				}
			}
		}
		this.gamePieces = gamePieces;
		Collections.shuffle(gamePieces);
	}
	
	public void startingDeal() {

		for (int i = 0; i < 6; i++) {
			player1Hand.add(gamePieces.pop());
			player2Hand.add(gamePieces.pop());
		}
		System.out.println(player1Hand);
		System.out.println(player2Hand);
	}


	public Stack<String> getGamePieces() {
		return gamePieces;
	}


	public ArrayList<String> getPlayer1Hand() {
		return player1Hand;
	}


	public ArrayList<String> getPlayer2Hand() {
		return player2Hand;
	}
	
	
	

}
