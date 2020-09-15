package touro.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class SnakeFrame extends JFrame {

    KeyListener listener;

    public SnakeFrame(
            GardenView gardenView,
            SnakeKeyListener snakeKeyListener
    ) throws HeadlessException {
        super();

        listener = snakeKeyListener;

        setSize(100,40);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        setLayout(new BorderLayout());

        add(gardenView, BorderLayout.CENTER);
        addKeyListener(listener);
    }
}
