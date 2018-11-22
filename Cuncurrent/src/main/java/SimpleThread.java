public class SimpleThread implements Runnable {
    public int count;
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            count++;
        }
        System.out.println(count);

    }
}
