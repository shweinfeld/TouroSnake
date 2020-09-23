package touro.snake;

import java.awt.*;

public class SnakeMain {

    public static void main(String[] args) {

        // Set up all class dependencies here.

        Snake snake = new Snake();
        FoodFactory foodFactory = new FoodFactory();
        Garden garden = new Garden(snake, foodFactory);
        GardenView gardenView = new GardenView(garden);
        SnakeKeyListener snakeKeyListener = new SnakeKeyListener(snake);

        GardenThread thread = new GardenThread(garden, gardenView);
        thread.start();

        new SnakeFrame(gardenView, snakeKeyListener).setVisible(true);
    }

}
