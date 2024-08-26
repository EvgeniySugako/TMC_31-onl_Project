package Homework_7;

import java.util.Scanner;

public class Doctors {
    private String doctorTypes;
    private String doctorName;

    Doctors() {
    }

    Doctors(String doctorTypes, String doctorName) {
        this.doctorTypes = doctorTypes;
        this.doctorName = doctorName;
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public String getDoctorTypes() {
        return doctorTypes;
    }

    public String getDoctorName() {
        return doctorName;
    }

    void treatment () {
        System.out.println("Все вылечим...");
    }

    String getDoctorFullInformation () {
        return "doctorTypes: " + this.doctorTypes + "\n" +
                "doctorName: " + this.doctorName;
    }
}
