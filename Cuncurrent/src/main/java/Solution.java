import java.util.concurrent.*;

public class Solution {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new SimpleThread());
        ex.execute(new SimpleThread());
        ex.shutdown();
    }
}
