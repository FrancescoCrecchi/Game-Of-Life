package TDP;

import java.util.ArrayList;

public class DeadState implements CellState {

	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitDeadCell(c, g, cmds);
	}
}
