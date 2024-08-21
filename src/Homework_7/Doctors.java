package Homework_7;

public class Doctors {
    private String doctorTypes;
    private String doctorName;
    private int doctorAge;

    Doctors (String doctorTypes, String doctorName, int doctorAge) {
        this.doctorTypes = doctorTypes;
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
    }

    void treatment () {
        System.out.println("Все вылечим...");
    }
    String getDoctorFullInformation () {
        return "doctorTypes: " + this.doctorTypes + "\n" +
                "doctorName: " + this.doctorName + "\n" +
                "doctorAge: " + this.doctorAge;
    }
}
