package tic.tac.toe;

import java.util.ArrayList;
import java.util.List;

import lejos.nxt.Button;

public class Board {


	
	static int[][] lines;
	/*
	 * Construction
	 */

	static {
		lines = new int[][] { 
		 // horizontal lines
		 { 0, 1, 2, 3},	
		 { 1, 2, 3, 4},	
		 { 5, 6, 7, 8},	
		 { 6, 7, 8, 9},	
		 {10,11,12,13},	
		 {11,12,13,14},	
		 {15,16,17,18},	
		 {16,17,18,19},	
		 {20,21,22,23},	
		 {21,22,23,24},	
         // vertical lines
		 { 0, 5,10,15},	
		 { 5,10,15,20},	
		 { 1, 6,11,16},	
		 { 6,11,16,21},	
		 { 2, 7,12,17},	
		 { 7,12,17,22},	
		 { 3, 8,13,18},	
		 { 8,13,18,23},	
		 { 4, 9,14,19},	
		 { 9,14,19,24},	
         // diagonal lines
		 { 0, 6,12,18},	
		 { 6,12,18,24},	
		 { 5,11,17,23},	
		 { 1, 7,13,19},	
		 { 4, 8,12,16},	
		 { 8,12,16,20},	
		 { 3, 7,11,15},	
		 { 9,13,17,21}
		};	
	}
	
	public boolean IsPlayerX;
	public boolean IsGameOver = false;
	public int Score;
	public Entry[] Board;
	private int m_score;
	
	public Board(Entry[] board, boolean isPlayerX) {
		IsPlayerX = isPlayerX;
		Board = board;
		m_score = calcScore();
	}
	
	/*
	 * Public interface
	 */
	
	public Board makeMove(int x, int y) {
		int i = x + y * 5;
		
		if (Board[i] != Entry.Empty) {
			System.out.println("lolol");
			Button.waitForAnyPress();
			throw new IllegalArgumentException(x+", "+y+", " +Board[i] );
		} 
		
		Entry[] newBoard = Board.clone();
		newBoard[i] = IsPlayerX ? Entry.X : Entry.O;
		
		return new Board(newBoard, !IsPlayerX);
	}
	
	public boolean isFinished() {
		if (IsGameOver) {
			System.out.println("GAME OVER!!!");
			return true;
		}
		for (int i = 0; i < Board.length; i++) {
			// the first empty slot we find means there are still moves
			if (Board[i] == Entry.Empty) {
				return false;
			}
		}
		// if the for above did not return, we have no more slots left
		return true;
	}
	
	/*
	 * Helpers
	 */
	
	public Board getNextMove(int depth) {
		MinMaxResult result = minmax(depth, IsPlayerX, Integer.MIN_VALUE + 1, Integer.MAX_VALUE - 1);
		return result.Board;
	}
	
	private MinMaxResult minmax(int depth, boolean isPlayerX, int alpha, int beta) {
		MinMaxResult result = new MinMaxResult();
		
		if (depth == 0 || isFinished()) {
			Score = m_score;
			result.Score = m_score;
			return result;
		}
		
		for (Board board : getChildren()) {
			// calculate next move
			MinMaxResult innerResult = board.minmax(depth - 1, !isPlayerX, alpha, beta); 
			
			// do alpha/beta evaluation
			if (isPlayerX) {
				if (alpha < innerResult.Score) {
					alpha = innerResult.Score;
					result.Board = board;
					if (alpha >= beta) {
						break;
					}
				}
			} else {
				if (beta > innerResult.Score) {
					beta = innerResult.Score;
					result.Board = board;
					if (alpha >= beta) {
						break;
					}
				}
			}
		}
		
		Score = isPlayerX ? alpha : beta;
		result.Score = Score;
		return result;
	}
	
	private List<Board> getChildren() {
		List<Board> result = new ArrayList<Board>();
		for (int i = 0; i < Board.length; i++) {
			if (Board[i] == Entry.Empty) {
				Entry[] newBoard = Board.clone();
				newBoard[i] = IsPlayerX ? Entry.X : Entry.O;
				result.add(new Board(newBoard, !IsPlayerX));
			}
		}
		return result;
	}
	
	private int calcScore() {
		int ret = 0;
		for (int[] line : lines) {
			Entry[] entries = new Entry[line.length];
			for (int i = 0; i < entries.length; i++) {
				entries[i] = Board[line[i]];
			}
			ret += calcScore(entries);
		}
		return ret;
	}
	
	private int calcScore(Entry[] line) {
		int x = 0;
		int o = 0;
		
		// count stones in given line
		for (Entry entry : line) {
			if (entry == Entry.X) {
				x++;
			} else if (entry == Entry.O) {
				o++;
			}
		}
		
		// 4 in a row means game over
		if (x == 4 || o == 4) {
			IsGameOver = true;
		}
		
		// calculate how much a line is worth
		int advantage = 1;
		if (o == 0) {
			if (IsPlayerX) {
				advantage = 5;
			}
			return (int)Math.pow(10, x) * advantage;
		} else if (x == 0) {
			if (!IsPlayerX) {
				advantage = 5;
			}
			return -(int)Math.pow(10, o) * advantage;
		}
		
		return 0;
	}	
}
