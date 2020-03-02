/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello from main thread");
        for (int i=0; i<100; i++) {
            System.out.println("Hello from MAIN thread: " + i);
        }
    }
}
