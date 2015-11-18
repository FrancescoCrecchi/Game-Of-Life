package TDP;

import java.util.ArrayList;

public class Cell {
	
	public int row;
	public int col;
	private CellState state = null;
	
	public Cell(int r, int c, boolean alive){
		if(alive)
			AliveState.create();
		else
			DeadState.create();
		row=r;
		col=c;
	}
	
	public void accept(LifeVisitor v, GameOfLife g, ArrayList<LifeCommand> cmds) {
		state.accept(v, this, g, cmds);
	}
	
	public void live(){
		state = state.live();
	}
	
	public void die(){
		state = state.die();
	}
	
	public int nbrOfNeighbors(GameOfLife game){
		int n = 0;
		//Return the number of 'alive' neighbors
		for (int i = row - 1; i < row + 1; i++) {
			for (int j = col - 1; j < col + 1; j++) {
				//Check borders and not the cell in use
				if((i >= 0 && i != row) && (j >= 0 && j != col))
					if(game.grid[i][j].isAlive())
						n++;
			}
		}
		return n;
	}
	
	public void toggle(){
		state = state.toggle();
	}
	
	public boolean isAlive(){
		return state.isAlive();
	}
}
