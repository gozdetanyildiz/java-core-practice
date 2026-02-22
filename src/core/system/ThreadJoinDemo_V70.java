package core.system;

public class ThreadJoinDemo_V70 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyRunnable_70("PING"));
        Thread thread2 = new Thread(new MyRunnable_70("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");
    }
}
