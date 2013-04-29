package tic.tac.toe;

import java.util.ArrayList;

public class Game {

	private Board board;
	ArrayList<Integer> moves;
	int currentX, currentY;

	public Game() {
		moves = new ArrayList<Integer>();
		Entry[] values = new Entry[25];
		for (int i = 0; i < values.length; i++) {
			values[i] = Entry.Empty;
		}
		board = new Board(values, true);
	}

	public boolean isFinished() {
		return board.isFinished();
	}

	public int getCurrentX() {
		return currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void makeAutomaticMove(int depth) {
		Board next = board.getNextMove(depth);
		if (next != null) {
			board = next;
			getCurrentMove(board);
		}
	}

	public void getCurrentMove(Board board) {
		for (int i = 0; i < board.Board.length; i++) {
			if (board.Board[i] == Entry.X && !moves.contains(i)) {
				moves.add(i);		
			}
		}

		getCurrentMove();
	}

	public void getCurrentMove() {
		int currentIndex = moves.get(moves.size() - 1);
		currentY = currentIndex / 5;
		currentX = currentIndex - 5 * currentY;
		//System.out.println("Current: " + currentX + " , " + currentY);
	}

	public void makeManualMove(int x, int y) {
		board = board.makeMove(x, y);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y < 5; y++) {
				switch (board.Board[x * 5 + y]) {
				case Empty:
					sb.append('-');
					break;
				case X:
					sb.append('X');
					break;
				case O:
					sb.append('O');
					break;
				}
			}
			sb.append('\n');
		}
		return sb.toString();
	}
}
