package Homework_8;

public class Animals {
    private final String animalsName;
    private final String animalsType;

    public Animals(String animalsName, String animalsType) {
        this.animalsName = animalsName;
        this.animalsType = animalsType;
    }

    public void voice() {
    }

    public void eat(String food) {
    }

    @Override
    public String toString() {
        return "animalsName: " + this.animalsName + '\n' +
                "animalsType: " + animalsType;
    }
}
