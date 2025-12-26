import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class DrawingPanel extends JPanel {
    private int x, y;
    private boolean drawCircle = false;
    private final int DIAMETER = 50;
    private Random rand = new Random();

    public void drawRandomCircle() {
        x = rand.nextInt(Math.max(1, getWidth() - DIAMETER));
        y = rand.nextInt(Math.max(1, getHeight() - DIAMETER));
        drawCircle = true;
        repaint();
    }

    public void clear() {
        drawCircle = false;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (drawCircle) {
            g.setColor(Color.BLUE);
            g.fillOval(x, y, DIAMETER, DIAMETER);
        }
    }
}

public class circleDrawingApp extends JFrame implements ActionListener {

    private DrawingPanel panel;
    private JButton drawButton, clearButton;

    public circleDrawingApp() {
        setTitle("Circle Drawing App");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new DrawingPanel();

        drawButton = new JButton("Draw Circle");
        clearButton = new JButton("Clear");

        drawButton.addActionListener(this);
        clearButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(drawButton);
        buttonPanel.add(clearButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            panel.drawRandomCircle();
        } else if (e.getSource() == clearButton) {
            panel.clear();
        }
    }

    public static void main(String[] args) {
        new circleDrawingApp();
    }
}
