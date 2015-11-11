package TDP;

import java.util.ArrayList;

public class AliveState implements CellState {

	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitLiveCell(c, g, cmds);
	}
}
