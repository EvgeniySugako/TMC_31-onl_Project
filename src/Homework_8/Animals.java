package Homework_8;

public class Animals {
    private final String animalsName;
    private final String animalsType;

    public Animals(String animalsName, String instrumentType) {
        this.animalsName = animalsName;
        this.animalsType = animalsType;
    }

    // Abstract method has no body just signature
    public abstract String sound();

    public abstract String speed();

    public abstract void getAdditionalData(String[] data);

    @Override
    public String toString() {
        return "Instruments{" +
                "animalsName='" + animalsName + '\'' +
                ", animalsType='" + animalsType + '\'' +
                '}';
    }
}
