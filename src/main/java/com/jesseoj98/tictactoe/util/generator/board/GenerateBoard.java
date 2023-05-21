package com.jesseoj98.tictactoe.util.generator.board;

import com.jesseoj98.tictactoe.domain.GameBoard;

/**
 * Generate board class provides implementations to generate game boards
 */
public class GenerateBoard {

	/**
	 * Generates a simple game board
	 * 
	 * @return a simple game board
	 */
	public char[] generateSimple() {
		return new char[GameBoard.GAME_BOARD_SPACES];
	}

	/**
	 * Generates a coordinate game board
	 * 
	 * @return a coordinate game board
	 */
	public char[][] generateCoordinate() {
		return new char[GameBoard.GAME_BOARD_DIMENSION][GameBoard.GAME_BOARD_DIMENSION];
	}

}
