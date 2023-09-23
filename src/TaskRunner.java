import java.time.LocalDateTime;

public class TaskRunner {
    public static void runner(Task task){
        System.out.println("Start : " + LocalDateTime.now());
        task.run();
        System.out.println("End : " + LocalDateTime.now());
    }
    public static void main(String[] args) {
        runner(new Task() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
    }
}

interface Task{
    void run();
}