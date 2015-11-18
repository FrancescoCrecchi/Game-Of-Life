package TDP;

import java.util.ArrayList;

public class DeadState implements CellState {
	
	static DeadState instance = null;
	
	private DeadState(){
		
	}
	
	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitDeadCell(c, g, cmds);
	}

	@Override
	public CellState live() {
		return AliveState.create();
	}

	@Override
	public CellState die() {
		return this;
	}

	@Override
	public CellState toggle() {
		return AliveState.create();
	}

	@Override
	public boolean isAlive() {
		return false;
	}
	public static CellState create() {
		if(instance == null){
			instance = new DeadState();
		}
		return instance;
	}
}
