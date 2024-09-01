package Homework_9.Task_1.Company;

public class Accountant extends Position {
    public Accountant(String name, String task) {
        super(name, task);
    }

    @Override
    public void appointTask(String task) {
        System.out.println("Task for the Accountant is: " + task);
    }
}
