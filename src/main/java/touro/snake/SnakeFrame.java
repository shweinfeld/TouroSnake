package touro.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class SnakeFrame extends JFrame {

    KeyEvent e;

    public SnakeFrame(
            GardenView gardenView,
            SnakeKeyListener snakeKeyListener
    ) throws HeadlessException {
        super();

        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        setLayout(new BorderLayout());

        add(gardenView, BorderLayout.CENTER);
        snakeKeyListener.keyPressed(e);

    }
}
