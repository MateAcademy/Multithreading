/**
 * @author Sergey Klunniy
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println("Hello from myThread: " + i);
        }
    }
}
