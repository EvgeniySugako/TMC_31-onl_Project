package Homework_7;

public class Surgeon extends Doctors{
    Surgeon (String doctorTypes, String doctorName, int doctorAge) {
        super (doctorTypes, doctorName, doctorAge);
    }

    @Override
    void treatment() {
        System.out.println("Мы лечим кости");
    }
}
