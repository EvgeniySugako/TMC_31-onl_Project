package Homework_9.Company;

public class Worker extends Position {
    public Worker(String name, String task) {
        super(name, task);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Worker is: " + task);
    }
}
