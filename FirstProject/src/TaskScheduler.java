import java.util.*;

class Task {
    String taskName;
    int duration;

    public Task(String taskName, int duration) {
        this.taskName = taskName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return taskName + " (Duration: " + duration + " mins)";
    }
}

public class TaskScheduler {
    private Queue<Task> taskQueue = new LinkedList<>();
    private Queue<Task> pendingQueue = new LinkedList<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            System.out.println("Processing Task: " + taskQueue.poll());
        } else if (!pendingQueue.isEmpty()) {
            System.out.println("Processing Task: " + pendingQueue.poll());
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void delayTask(String taskName) {
        Iterator<Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.taskName.equals(taskName)) {
                iterator.remove();
                pendingQueue.offer(task);
                System.out.println("Delaying Task: " + task.taskName);
                return;
            }
        }
    }

    public void displayTasks() {
        System.out.println("Scheduled Tasks:");
        if (taskQueue.isEmpty()) {
            System.out.println("(No tasks)");
        } else {
            taskQueue.forEach(System.out::println);
        }

        System.out.println("Pending Tasks:");
        if (pendingQueue.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            pendingQueue.forEach(System.out::println);
        }
    }
}

class MainScheduler {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 20));
        scheduler.addTask(new Task("System Update", 45));
        scheduler.addTask(new Task("Database Backup", 30));
        scheduler.addTask(new Task("Deploy New Feature", 50));
        scheduler.addTask(new Task("Bug Fixing", 25));

        System.out.println("Tasks Added:");
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.delayTask("Code Review");
        scheduler.displayTasks();

        scheduler.delayTask("Database Backup");
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();

        scheduler.processTask();
        scheduler.displayTasks();
    }
}
