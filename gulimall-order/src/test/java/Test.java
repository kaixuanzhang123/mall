import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test {

    public static void futureTest() throws Exception {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int a= 1/0;
            return "future1 finished!";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return "future2 finished!";
        });
        CompletableFuture<Void> combindFuture = CompletableFuture.allOf(future1, future2);
        try {
            combindFuture.get();
        } catch (InterruptedException e) {
            throw new Exception(e);
        } catch (ExecutionException e) {
            throw new Exception(e);
        }
        System.out.println("future1: " + future1.isDone() + " future2: " + future2.isDone());
    }

    public static void main(String[] args) throws Exception {
        futureTest();
    }
}
