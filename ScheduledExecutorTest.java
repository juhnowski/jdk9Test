import java.util.concurrent.*;
import java.util.*;

class ScheduledExecutorTest {
public static void main(String[] args) {
        try{
                ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

                Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
                ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

                TimeUnit.MILLISECONDS.sleep(1337);

                long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
                System.out.printf("Remaining Delay: %sms", remainingDelay);
        } catch(Exception e) {
                e.printStackTrace();
        }
}
}
