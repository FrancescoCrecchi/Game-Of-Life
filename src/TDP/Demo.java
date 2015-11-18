package TDP;

import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Create a new instance of GoL
		GameOfLife gameOfLife = new GameOfLife(10,10);
		gameOfLife.initialize();
		gameOfLife.printBoard();
		
		LifeVisitor visitor = new LifeVisitor();
		
		for (int i = 0; i < 100; i++) {
			gameOfLife.advance(visitor);
			gameOfLife.printBoard();
			Thread.sleep(1000); //1sec sleep
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
	}

}