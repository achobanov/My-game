//######################################################################################################################
// Board.java - initializes the frame and canvas objects.
//######################################################################################################################
package frame;

import java.awt.*;
import javax.swing.*;

public class Board extends Canvas {

    public static int canvasX;
    public static int canvasY;

    private Canvas canvas;
    private String name;
    private int width, height;

    public Board(String name, int width, int height) {    // Board constructor
        this.name = name;
        this.width = width;
        this.height = height;
        canvasX = width;
        canvasY = height;
        createBoard();
    }

    private void createBoard() {

        JFrame frame = new JFrame(this.name);
//        frame.setPreferredSize(new Dimension(width, height));
//        frame.setMinimumSize(new Dimension(width, height));
//        frame.setMaximumSize(new Dimension(width, height));
        frame.setSize(width, height);
        frame.setFocusable(true);
        frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        canvas = new Canvas();    // Initializes Canvas, the space we will draw our game.
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));

        frame.add(canvas);
        frame.pack();
    }
    // Following functions return variables, if needed from other classes.
    public Canvas getCanvas() {
        return this.canvas;
    }

    public int getBoardWidth() {
        return width;
    }

    public int getBoardHeight() {
        return height;
    }
}
