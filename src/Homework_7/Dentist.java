package Homework_7;

public class Dentist extends Doctors{
    Dentist (String doctorTypes, String doctorName, int doctorAge) {
        super (doctorTypes, doctorName, doctorAge);
    }

    @Override
    void treatment() {
        System.out.println ("Мы лечим зубы");
    }
}
