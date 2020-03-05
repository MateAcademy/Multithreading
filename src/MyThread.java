/**
 * @author Sergey Klunniy
 */
public class MyThread extends Thread {

    private String nameThread;

    public MyThread(String nameThread) {
        this.nameThread = nameThread;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                new DataProcessingException("method run throws exception" + e);
            }
            System.out.println("Hello from " + nameThread + ": " + i);
        }
    }
}
