class MyThread extends Thread{
    @Override
     public void run() {
        System.out.println("Thread Started");
        System.out.println(currentThread().getName());

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Complete");
    }
}

public class MultiThreadingPractice {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        MyThread myThread = new MyThread();
        myThread.setName("A");
        myThread.start();

//        Thread.currentThread().join();
        myThread.join();

        System.out.println("Main Ended");

//        MyThread myThread = new MyThread();
//        myThread.setName("A");
//

//        myThread.start();
//        System.out.println();
//
//        myThread.join();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.setName("B");
//        myThread2.start();
//        System.out.println();
//
//        myThread2.join();
//
//        MyThread myThread3 = new MyThread();
//        myThread3.setName("C");
//        myThread3.start();
//        System.out.println();



    }
}
