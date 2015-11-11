package TDP;

import java.util.ArrayList;

public class DeadState implements CellState {

	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitDeadCell(c, g, cmds);
	}

	@Override
	public CellState live() {
		return new AliveState();
	}

	@Override
	public CellState die() {
		return this;
	}

	@Override
	public CellState toggle() {
		return new AliveState();
	}

	@Override
	public boolean isAlive() {
		return false;
	}
}
