package TDP;

import java.util.ArrayList;

public class AliveState implements CellState {

	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitLiveCell(c, g, cmds);
	}
	
	public CellState live(){
		return this;		
	}
	
	@Override
	public CellState die(){
		return new DeadState();
	}

	@Override
	public CellState toggle() {
		return new DeadState();
	}

	@Override
	public boolean isAlive() {
		return true;
	}
}
