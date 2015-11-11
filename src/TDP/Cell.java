package TDP;

import java.util.ArrayList;

public class Cell {

	private CellState state = null;
	
	public void accept(LifeVisitor v, GameOfLife g, ArrayList<LifeCommand> cmds) {
		state.accept(v, this, g, cmds);
	}
	
}
