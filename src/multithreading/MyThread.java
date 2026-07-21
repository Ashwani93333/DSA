package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        //thread Work

        for (; ;) {
            System.out.println("My thread is running");

        }
    }
}
