package TDP;

import java.util.ArrayList;

public class AliveState implements CellState {
	static AliveState instance = null;
	
	private AliveState(){
		
	}
	
	public static CellState create(){
		if(instance == null){
			instance = new AliveState();
		}
		return instance;		
	}
	
	@Override
	public void accept(LifeVisitor v, Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		v.visitLiveCell(c, g, cmds);
	}
	
	public CellState live(){
		return this;		
	}
	
	@Override
	public CellState die(){
		return DeadState.create();
	}

	@Override
	public CellState toggle() {
		return DeadState.create();
	}

	@Override
	public boolean isAlive() {
		return true;
	}
}
