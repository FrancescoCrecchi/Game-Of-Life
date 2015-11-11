package TDP;

import java.util.ArrayList;

public interface CellState {

	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds);
	public CellState live();
	public CellState die();
	public CellState toggle();
	public boolean isAlive();
}
