/* TicTacToe.java

This program displays a resizeable Tic Tac Toe game.  Play alternates
between the user, who plays O, and the computer, which plays X.
After the game ends the program displays a dialog box announcing the
winner and the total number of wins, losses, and draws by the user, and
asks if the user wants to play again.  If the user clicks YES then the
screen is cleared and a new game started.  Otherwise the program exits.
The computer moves first on alternate games.

At the top of the screen is a slider that allows the user to change
the line thickness of the O's, X's and the 3x3 grid.  There are also
2 buttons allowing the user to change the colors of the O's and X's.
Initially lines are 4 pixels thick, O's are blue and X's are red.

The computer's strategy is first to complete 3 X's in a row, or if that
is not possible, to block a row of 3 O's, or if that is not possible,
to move randomly.
*/

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class TicTacToeFrame extends JFrame {
    private Board board;
    private int lineThickness = 4;
    static final char BLANK = ' ', zero = 'O', x = 'X';
    private char position[] = {  // Board position (WHITE or BLACK)
            BLANK, BLANK, BLANK,
            BLANK, BLANK, BLANK,
            BLANK, BLANK, BLANK};

    // Start the game
    public static void main(String args[]) {
        new TicTacToeFrame();
        JPanel contentPane = new JPanel(new BorderLayout());
        //contentPane.setBorder();


        //contentPane.add(, BorderLayout.CENTER);
        //contentPane.add(rect2, BorderLayout.PAGE_END);*/

    }

    // Initialize
    public TicTacToeFrame() {
        super("Tic Tac Toe demo");
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(new JLabel("Conway's Game of Life Simulation"));
        add(topPanel, BorderLayout.NORTH);
        add(board = new Board(), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }


    // Board is what actually plays and displays the game
    public class Board extends JPanel {
        private Random random = new Random();
        private int rows[][] = {{0, 2}, {3, 5}, {6, 8}, {0, 6}, {1, 7}, {2, 8}, {0, 8}, {2, 6}};
        // Endpoints of the 8 rows in position[] (across, down, diagonally)


        // Redraw the board
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            Graphics2D g2d = (Graphics2D) g;

            // Draw the grid
            g2d.setPaint(Color.WHITE);
            g2d.fill(new Rectangle2D.Double(0, 0, w, h));
            g2d.setPaint(Color.BLACK);
            g2d.setStroke(new BasicStroke(lineThickness));
            g2d.draw(new Line2D.Double(0, h / 3, w, h / 3));
            g2d.draw(new Line2D.Double(0, h * 2 / 3, w, h * 2 / 3));
            g2d.draw(new Line2D.Double(w / 3, 0, w / 3, h));
            g2d.draw(new Line2D.Double(w * 2 / 3, 0, w * 2 / 3, h));

        }


        }


    }
