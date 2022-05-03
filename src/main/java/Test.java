import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;

public class Test extends JPanel {

    public static void main(String[] args) {



        JFrame frame = new JFrame("top level container");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 800);

        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 10;
        constraints.gridx = 10;
        constraints.gridy = 10;
        frame.setLayout(grid);




        frame.setVisible(true);
    }

    static class Boxes extends JPanel {
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            // Draw Text
            g.setColor(Color.BLACK);
            g.drawRect(1,1,10,10);
        }

    }



    }
