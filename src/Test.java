/**
 * @author Sergey Klunniy
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("myThread-1");
        myThread.start();

        MyThread myThread2 = new MyThread("myThread-2");
        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake!");

        System.out.println("Hello from main thread");
        for (int i=0; i<100; i++) {
            Thread.sleep(50);
            System.out.println("Hello from MAIN thread: " + i);
        }
    }
}
