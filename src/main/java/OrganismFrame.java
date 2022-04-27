import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class OrganismFrame extends JFrame{

    private static Board board;
    public static void main(String[] args) {

        JFrame frame = new JFrame("j frame");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(board = new Board(), BorderLayout.CENTER);
        panel.setVisible(true);


        frame.add(panel);
        frame.setVisible(true);




    }
    static class Board extends JPanel{

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            int w = getWidth();
            int h = getHeight();
            Graphics2D graph= (Graphics2D) g;

            graph.setPaint(Color.WHITE);
            graph.fill(new Rectangle2D.Double(5,5,w,h));

        }

    }


}
