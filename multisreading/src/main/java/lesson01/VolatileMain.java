package lesson01;

public class VolatileMain {

    static  int x = 0;
//    static int x = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadWrite());
        Thread thread2 = new Thread(new ThreadRead());
        thread.start();
        thread2.start();
    }

    static class ThreadWrite implements Runnable {

        @Override
        public void run() {
            while (x < 5) {
                System.out.println("Thread1: increment x: " + ++x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ThreadRead implements Runnable {

        @Override
        public void run() {
            int localX = x;
            while (localX < 5) {
                System.out.println("Thread2: localx=" + localX);
                if (localX != x) {
                    System.out.println("Thread2: localX=" + localX + ", new val x: " + x);
                    localX = x;
                }
            }
        }
    }
}