import java.util.concurrent.*;
import java.util.*;

class FutureAnyTest {

static Callable<String> callable(String result, long sleepSeconds) {
        return () -> {
                       TimeUnit.SECONDS.sleep(sleepSeconds);
                       return result;
        };
}

public static void main(String[] args) {

        try {
                ExecutorService executor = Executors.newWorkStealingPool();

                List<Callable<String> > callables = Arrays.asList(
                        callable("task1", 2),
                        callable("task2", 1),
                        callable("task3", 3));


                String result = executor.invokeAny(callables);
                System.out.println(result);
        } catch(Exception e) {
                e.printStackTrace();
        }
System.out.println("===========================");
}
}
