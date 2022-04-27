import javax.swing.*;
import java.awt.*;

public class Test extends JPanel {

    public static void main(String[] args) {

        JFrame frame = new JFrame("top level container");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        GridLayout grid = new GridLayout(25,25,0,0);
        JPanel contentPane = new JPanel(grid);
        contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        System.out.println(contentPane.getMaximumSize());
        System.out.println(contentPane.getPreferredSize());
        System.out.println(grid.getColumns());
        System.out.println(grid.getRows());
        System.out.println(grid);

        contentPane.setBackground(Color.BLACK);
        for (int i = 0; i < grid.getRows() * grid.getColumns() - 20; i++){

            contentPane.add("boxes", new Boxes());
        }


        frame.add(contentPane);


        frame.setVisible(true);
    }

    static class Boxes extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Draw Text
            g.setColor(Color.black);
            g.drawRect(0,0,200,200);
        }
    }
    static class Cell extends JPanel{
        public void paintComponents(Graphics g){
            super.paintComponents(g);
            g.setColor(Color.BLACK);
            g.fillRect(0,0,200,200);

        }
    }
}
