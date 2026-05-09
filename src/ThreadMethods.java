package src;

public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("Main thread starts");

        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000); // timed waiting the thread will go to sleep and will if that thread had a lock on critical section it will not release it until terminated
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("New Thread");
        });
        t1.start();
//      t1.join(); this  one means untill the t1 thread is not in the runnable state do not perform any action
        try {
            t1.join(1000); //parametrized join means the program after this will wait for certain amount of time
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Main thread ends");
    }
}
