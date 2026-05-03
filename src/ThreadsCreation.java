package src;

public class ThreadsCreation {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.getName());

        ThreadImpl thread = new ThreadImpl();
        Thread thread1 = new Thread(thread);
        thread1.start();
    }
    // create thread by extending the Thread class
    public static class MyThread extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Thread created by extending Thread class");
        }

    }

    // creating thread by implementing the interface is always the best choice
    public static class ThreadImpl implements Runnable
    {
        @Override
        public void run() {
            System.out.println("Hii I am created by implementing the Runnable interface");
        }
    }


}
