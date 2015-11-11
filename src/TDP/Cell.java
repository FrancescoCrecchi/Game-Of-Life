package TDP;

import java.util.ArrayList;

public class Cell {
	
	public int row;
	public int col;
	private CellState state = null;
	
	public Cell(int r, int c){
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
	
	public void nbrOfNeighbors(GameOfLife game){
		//TODO
	}
	
	public void toggle(){
		state = state.toggle();
	}
	
	public boolean isAlive(){
		return state.isAlive();
	}
}
