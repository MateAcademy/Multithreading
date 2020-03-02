/**
 * @author Sergey Klunniy
 */
public class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                new DataProcessingException("" +
                        "method run throws exception in class Runner" + e);
            }
            System.err.println("Hello from class Runner: " + i);
        }
    }
}
