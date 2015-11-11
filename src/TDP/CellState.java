package TDP;

import java.util.ArrayList;

public interface CellState {

	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommands> cmds);
	
}
