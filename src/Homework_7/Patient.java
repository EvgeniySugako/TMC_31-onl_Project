package Homework_7;

public class Patient {
    private final String name;
    private int treatmentPlan;
    private Doctors doctor;

    public Patient(String name) {
        this.name = name;
    }

    public void setTreatment(int treatmentPlan, Doctors doctor) {
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public String getName() {
        return "Patient name: " + name;
    }
}
