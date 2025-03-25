import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.*;

class Task implements Comparable<Task> {
    String taskName;
    int priority;
    int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }
    @Override
    public int compareTo(Task other) {
        if (this.priority == other.priority) {
            return Integer.compare(this.duration, other.duration);
        }
        return Integer.compare(other.priority, this.priority);
    }

    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}

public class TaskScheduler {
    private PriorityQueue<Task> taskQueue;
    private Queue<Task> pendingQueue;
    private HashMap<Task, ArrayList<LocalDateTime>> completed;

    public TaskScheduler() {
        taskQueue = new PriorityQueue<>();
        pendingQueue = new LinkedList<>();
        completed = new HashMap<>();
    }

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
        System.out.println("Scheduled Tasks (sorted by priority):");
        if (taskQueue.isEmpty()) {
            System.out.println("(No priority tasks)");
        } else {
            taskQueue.forEach(System.out::println);
        }

        System.out.println("Pending Tasks (FIFO Order):");
        if (pendingQueue.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            pendingQueue.forEach(System.out::println);
        }
    }
}

class MainScheduler {
    public static <T> ArrayList<T> method1(ArrayList<T> arr1, ArrayList<T> arr2){
        int mm;
        ArrayList<T> merged = new ArrayList<>();

        if(arr1.size() < arr2.size())
            mm = arr2.size();
        else mm = arr1.size();

        for(int i =0; i<mm; i++){
            if(i<arr1.size()){
                merged.add(arr1.get(i));
            }
            if(i<arr2.size()){
                merged.add(arr2.get(i));
            }
        }

        return merged;
    }
    public static  <K, V> void method2(HashMap<K, V> hash){
        for(K key: hash.keySet() ){
            System.out.println("Key: " + key + " Value: " + hash.get(key));
        }
    }

    public static void main(String[] args) {
        //this is my Method 1
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        list1 = method1(list1, list2);
        System.out.println(list1);


        //this is my Method 2
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        method2(map);

        //this is the task 3
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database backup", 2, 30));
        scheduler.addTask(new Task("Deploy new feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

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

