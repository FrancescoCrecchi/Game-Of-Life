package TDP;

import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		GameOfLifeApp gol = new GameOfLifeApp("GameOfLife - Design Patterns Version", 60, 60, 10);
		
		gol.run();
		
		/*
		//Create a new instance of GoL
		GameOfLife gameOfLife = new GameOfLife(60,60);
		GameOfLifeUI UI = new GameOfLifeUI("GoL", 60, 60, 10, gameOfLife);
		GameOfLifeUI UI2 = new GameOfLifeUI("GoL", 60, 60, 5, gameOfLife);
		
		gameOfLife.attach(UI);
		gameOfLife.attach(UI2);
		gameOfLife.initialize();
		//gameOfLife.printBoard();
		
		LifeVisitor visitor = new LifeVisitor();
		
		for (int i = 0; i < 100; i++) {
			gameOfLife.advance(visitor);
			gameOfLife.printBoard();
			Thread.sleep(1000); //1sec sleep
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		*/
	}

}