package touro.snake;

import java.util.Random;

/**
 * Factory class for creating new Food objects within the Garden.
 */
public class FoodFactory {

    /**
     * @return a new Food with random coordinates in the Garden
     */
    private final int GARDEN_WIDTH = 100;
    private final int GARDEN_HEIGHT = 40;

    public Food newInstance() {
        // Peikes
        Random coordinateGenerator = new Random();
        int randX = coordinateGenerator.nextInt(GARDEN_WIDTH)+1;
        int randY = coordinateGenerator.nextInt(GARDEN_HEIGHT)+1;
        return new Food(randX,randY);
    }

}
