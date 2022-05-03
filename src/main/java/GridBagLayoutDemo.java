
import java.awt.*;
import javax.swing.*;

public class GridBagLayoutDemo {

    public static void addComponentsToGridBag(Container pane) {
        Boxes box;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //c.weightx = 50;
        //c.gridx = 400;
        //c.gridy = 400;
        box = new Boxes();
        pane.add(box, c);
        JButton button = new JButton("button");
        pane.add(button,c);
        pane.add(button,c);
        pane.add(button,c);
        pane.add(button,c);

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        //Set up the content pane.
        addComponentsToGridBag(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    static class Boxes extends JPanel {
        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            // Draw Text
            g.setColor(Color.BLACK);
            g.drawRect(0, 0, 20, 20);
        }

    }
}