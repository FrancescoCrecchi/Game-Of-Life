package TDP;

import java.util.ArrayList;

public class LifeVisitor {
	
	public void visit(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		c.accept(this, g, cmds);
	}
	
	public void visitLiveCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//Rule: if(n < 2 || n > 3) neighbors alive -> dead()
		int numAliveNbrs = c.nbrOfNeighbors(g);
		if( numAliveNbrs < 2 || numAliveNbrs > 3 )
			cmds.add(new DieCommand(c));
	}
	
	public void visitDeadCell(Cell c, GameOfLife g, ArrayList<LifeCommand> cmds) {
		//Rule: if n=3 neighbors are alive -> alive()
		int numAliveNbrs = c.nbrOfNeighbors(g);
		if( numAliveNbrs == 3 )
			cmds.add(new LiveCommand(c));
	}
	
}
