import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;

class FutureTest {
public static void main(String[] args) {

        Callable<Integer> task = () -> {
                try {
                        TimeUnit.SECONDS.sleep(1);
                        return 123;
                }
                catch (InterruptedException e) {
                        throw new IllegalStateException("task interrupted", e);
                }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());
        Integer result = 0;
        try {
            result = future.get();
        } catch(InterruptedException ie) {
          ie.printStackTrace();
        } catch(Exception ex){
          ex.printStackTrace();
        }

        System.out.println("future done? " + future.isDone());
        System.out.println("result: " + result);
        System.out.println("=====================================");
}
}
