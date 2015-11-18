package TDP;

import java.util.ArrayList;

public class GameOfLife {

	Cell[][] grid = null;
	ArrayList<LifeVisitor> observers = null;
	ArrayList<LifeCommand> cmds = null;
	
	public GameOfLife(int rows, int cols) {
		
		grid = new Cell[rows+2][cols+2]; //added surrounding border
		this.cmds = new ArrayList<LifeCommand>();
	}
	
	public void initialize() {
		//Initialize grid
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = new Cell(i, j, false); //initially all cells are dead
			}
		}
		//Demo: blinker
		grid[3][3].toggle();
		grid[3][4].toggle();
		grid[3][5].toggle();
	}
	
	public void advance(LifeVisitor visitor) {
		//Create a list of "LifeCommands"
		for (int i = 1; i < grid.length - 1; i++) { //rows
			for (int j = 1; j < grid[0].length - 1; j++) { //cols
				visitor.visit(grid[i][j], this, cmds);
			}
		}
		//Execute commands in the list
		for (LifeCommand lifeCommand : cmds) {
			lifeCommand.execute();
		}
		cmds.clear();
	}
	
	public void printBoard() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j].isAlive() ? "O" : ".");
			}
			System.out.print('\n');
		}
	}
}
