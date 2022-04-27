import javax.swing.*;
import java.awt.*;

public class Test extends JPanel {

    public static void main(String[] args) {

        JFrame frame = new JFrame("top level container");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JPanel contentPane = new JPanel(new GridLayout(2, 2, 0, 0));
        contentPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add("boxes", new Boxes());
        contentPane.add("boxes", new Boxes());
        contentPane.add("boxes", new Boxes());
        contentPane.add("boxes", new Boxes());
        frame.add(contentPane);


        frame.setVisible(true);
    }

    static class Boxes extends JPanel {
        public Dimension getPreferredSize() {
            return new Dimension(50, 50);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw Text
            g.drawRect(1,1,50,50);
        }
    }
}
