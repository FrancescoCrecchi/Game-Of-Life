package TDP;

public class GameOfLifeApp {

	GameOfLife gameOfLife;
	GameOfLifeUI UI;
	LifeVisitor visitor;

	public GameOfLifeApp(String title, int rows, int cols, int dim) {

		gameOfLife = new GameOfLife(rows, cols);
		UI = new GameOfLifeUI(title, rows, cols, dim, gameOfLife);
		visitor = new LifeVisitor();
		
		gameOfLife.attach(UI);
		gameOfLife.initialize();
	}

	public void run() throws InterruptedException {
		while (true) {
			gameOfLife.advance(visitor);
			//gameOfLife.printBoard();
			Thread.sleep(500); // 0.5sec sleep
		}
	}
}
