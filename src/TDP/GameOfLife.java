package TDP;

import java.util.ArrayList;

public class GameOfLife {

	Cell[][] grid = null;
	ArrayList<LifeVisitor> observers = null;
	ArrayList<LifeCommand> cmds = null;
	
	public GameOfLife() {
		this.cmds = new ArrayList<LifeCommand>();
	}
	
	public void advance(LifeVisitor visitor) {
		for (int i = 0; i < grid.length; i++) { //rows
			for (int j = 0; j < grid[0].length; j++) { //cols
				visitor.visit(grid[i][j], this, cmds);
			}
		}
	}
}
