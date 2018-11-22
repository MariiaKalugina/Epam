import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> integerFuture = ex.submit(new CallableThread());
        Future<Integer> integerFuture1 = ex.submit(new CallableThread());
        try {
            System.out.println(" а я уже здесь!");
            System.out.println(integerFuture.get());
            System.out.println(integerFuture.isDone());
            System.out.println(integerFuture.get());
            System.out.println(integerFuture1.get());
            System.out.println(integerFuture.isDone());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
