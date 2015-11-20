package TDP;

import java.awt.*;

public class GameOfLifeUI {
	private Frame _mainFrame;
	private MyCanvas _canvas;

	public GameOfLifeUI(String name, int r, int c, int d, GameOfLife game) {
		_mainFrame = new Frame(name);
		_mainFrame.setSize(c * d + 18, r * d + 40);
		_canvas = new MyCanvas(r, c, d, game);
		_mainFrame.add(_canvas);

		_mainFrame.setVisible(true);
	}

	class MyCanvas extends Canvas {

		GameOfLife game;
		int rows, cols, dim;

		public MyCanvas(int r, int c, int d, GameOfLife g) {
			this.game = g;
			this.rows = r;
			this.cols = c;
			this.dim = d;

			setBackground(Color.GRAY);
			setSize(cols * dim, rows * dim);
		}

		public void paint(Graphics g) {
			Graphics2D g2;
			g2 = (Graphics2D) g;
			for (int i = 1; i < game.grid.length - 1; i++) {
				for (int j = 1; j < game.grid[0].length - 1; j++) {
					if (game.grid[i][j].isAlive())
						g2.setColor(Color.WHITE);
					else
						g2.setColor(Color.BLACK);

					g2.fillRect(j * dim - dim, i * dim - dim, dim, dim);
				}
			}
		}
	}
	
	//Observer pattern
	public void update() {
		_canvas.repaint();
	}

}
