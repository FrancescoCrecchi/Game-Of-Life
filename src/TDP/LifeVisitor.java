package TDP;

import java.util.ArrayList;

public class LifeVisitor {
	
	public void visit(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		c.accept(this, g, cmds);
	}
	
	public void visitLiveCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//TODO: implementation
	}
	
	public void visitDeadCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//TODO: implementation
	}
	
}
