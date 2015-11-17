package TDP;

import java.util.ArrayList;

public class LifeVisitor {
	
	public void visit(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		c.accept(this, g, cmds);
	}
	
	public void visitLiveCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//Rule: if(n < 2 || n > 3) neighbors alive -> dead()
		//TODO:
	}
	
	public void visitDeadCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//Rule: if n=3 neighbors are alive -> alive()
		//TODO:
	}
	
}
