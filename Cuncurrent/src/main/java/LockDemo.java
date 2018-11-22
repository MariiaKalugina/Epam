import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {
    public static int count;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockDemo lock1 = new LockDemo();
        LockDemo lock2 = new LockDemo();
        Thread th1 = new Thread();
        Thread th2 = new Thread();

        th1.start();
        th2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            if (lock.tryLock()) {

            } else {
            }
            count++;
            lock.unlock();
        }
        System.out.println(count);
    }
}
