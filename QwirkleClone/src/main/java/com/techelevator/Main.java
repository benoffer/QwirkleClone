package com.techelevator;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi.BColor;
import com.diogonunes.jcdp.color.api.Ansi.FColor;

public class Main {

	public static void main(String[] args) {
		GamePieces game = new GamePieces();
		game.startingDeal();
		System.out.printf(game.toString(game.getPlayer1Hand()));
		System.out.printf(game.toString(game.getPlayer2Hand()));
		
		ColoredPrinter cp = new ColoredPrinter.Builder(0, false).foreground(FColor.RED).background(BColor.YELLOW).build();
		cp.print(game.toString(game.getPlayer1Hand()));
		
	}

}
