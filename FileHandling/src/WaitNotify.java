public class WaitNotify {
        private Object lock = new Object();

        public static void main(String[] args) {
            WaitNotify wn = new WaitNotify();
            new Thread(() -> {
                try {
                    synchronized (wn.lock) {
                        System.out.println("Acquired Lock Thread 1");
                        Thread.sleep(5000);
                        wn.lock.wait();
                        System.out.println("Thread running back");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
                    Thread.sleep(500);
                    synchronized (wn.lock) {
                        System.out.println("Acquired Lock Thread 2");
                        wn.lock.notify();
                        System.out.println("Thread finishing work");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

