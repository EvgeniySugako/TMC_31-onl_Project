package Homework_9.Company;

public abstract class Position implements Tasks {
    private final String name;
    private final String task;

    public Position(String name, String task) {
        this.name = name;
        this.task = task;
    }

    @Override
    public String toString() {
        return "Position: " + this.name + '\n' +
                "Task: " + this.task;
    }
}
