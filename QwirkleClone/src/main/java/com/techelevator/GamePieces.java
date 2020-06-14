package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;

public class GamePieces {

	private ArrayList<String> gamePieces;
	private ArrayList<String> player1Hand;
	private ArrayList<String> player2Hand;

	private String[] colors = new String[] { "Blue", "Yellow", "Green", "Purple", "Orange", "White" };
	private String[] shapes = new String[] { "Star", "Circle", "Triangle", "Square", "Diamond", "Horseshoe" };

	public GamePieces() {
		ArrayList<String> gamePieces = new ArrayList<>();

		for (int c = 0; c < colors.length; c++) {
			for (int s = 0; s < colors.length; s++) {
				for (int n = 0; n < 3; n++) {
					gamePieces.add(colors[c] + "," + shapes[s]);
				}
			}
		}
		this.gamePieces = gamePieces;
	}
	
	public void startingDeal() {
		Collections.shuffle(gamePieces);
		for (int i = 0; i < 6; i++) {
			player1Hand.add(gamePieces.get(0));
			player2Hand.add(gamePieces.get(0));
		}
		System.out.println(player1Hand);
		System.out.println(player2Hand);
	}


	public ArrayList<String> getGamePieces() {
		return gamePieces;
	}


	public ArrayList<String> getPlayer1Hand() {
		return player1Hand;
	}


	public ArrayList<String> getPlayer2Hand() {
		return player2Hand;
	}
	
	
	

}
