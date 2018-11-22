import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {
    public int count = 0;

    @Override
    public Integer call() {
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }
}
