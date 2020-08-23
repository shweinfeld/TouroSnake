package touro.snake;

/**
 * Thread responsible for advancing the Garden and updating GardenView.
 */
public class GardenThread extends Thread {

    private static final int DELAY_MS = 500;
    private final Garden garden;
    private final GardenView gardenView;

    public GardenThread(Garden garden, GardenView gardenView) {
        this.garden = garden;
        this.gardenView = gardenView;
    }

    public void run() {
        while (garden.advance()) {
            gardenView.repaint();
            try {
                Thread.sleep(DELAY_MS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
