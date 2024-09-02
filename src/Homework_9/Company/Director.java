package Homework_9.Company;

public class Director extends Position {
    public Director(String name, String task) {
        super(name, task);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Director is: " + task);
    }
}
