package touro.snake;

/**
 * Thread responsible for advancing the Garden and updating GardenView.
 */
public class GardenThread extends Thread {

    private static final int DELAY_MS = 80;
    private int currDelay;
    private int currRound;

    private final Garden garden;
    private final GardenView gardenView;

    public GardenThread(Garden garden, GardenView gardenView) {
        this.garden = garden;
        this.gardenView = gardenView;
        currDelay = DELAY_MS;
        currRound = 0;
    }

    /**
     * Every second, advance the Garden (moving the Snake, eating, death) and repaint the Garden
     */
    public void run() {
        while (garden.advance()) {
            gardenView.repaint();
            try {
                decrementTime();
                Thread.sleep(currDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void decrementTime() {
        if (currDelay > 15) { //the smallest delay allowed
            if (currRound < 50) {
                currRound++;
            } else {
                currDelay--;
                currRound = 0;
            }
        }
    }
}
