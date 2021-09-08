package solution;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Label;

/**
 * A custom component that acts as a simple stop-watch.  When the user clicks
 * on it, this component starts timing.  When the user clicks again,
 * it displays the time between the two clicks.  Clicking a third time
 * starts another timer, etc.  While it is timing, the label just
 * displays the message "Timing....".
 */
public class StopWatchLabel extends Label {

    private long startTime;   // Start time of timer.
                              //   (Time is measured in milliseconds.)

    AnimationTimer timer = new AnimationTimer() {
        long previousTime;
        @Override
        public void handle(long time) {
            if(time - previousTime > 0.95e9/60){
                long currentTime = System.currentTimeMillis();
                double seconds = (currentTime - startTime) / 1000.0;
                setText( String.format("Time: %1.3f seconds", seconds) );
            }
            previousTime = time;
        }
    };

    private boolean running;  // True when the timer is running.

    /**
     * Constructor sets initial text on the label to
     * "Click to start timer." and sets up a mouse event
     * handler so the label can respond to clicks.
     */
    public StopWatchLabel() {
        super("  Click to start timer.  ");
        setOnMousePressed( e -> setRunning( !running ) );
    }


    /**
     * Tells whether the timer is currently running.
     */
    public boolean isRunning() {
        return running;
    }





    /**
     * Sets the timer to be running or stopped, and changes the text that
     * is shown on the label.  (This method should be called on the JavaFX
     * application thread.)
     * @param running says whether the timer should be running; if this
     *    is equal to the current state, nothing is done.
     */
    public void setRunning( boolean running ) {
        if (this.running == running)
            return;


        this.running = running;
        if (running) {
                // Record the time and start the timer.
            startTime = System.currentTimeMillis();  
            setText("Timing....");
            timer.start();
        }
        else {
                // Stop the timer.  Compute the elapsed time since the
                // timer was started and display it.
            timer.stop();
            long endTime = System.currentTimeMillis();
            double seconds = (endTime - startTime) / 1000.0;
            setText( String.format("Time: %1.3f seconds", seconds) );
        }
    }




} // end StopWatchLabel
