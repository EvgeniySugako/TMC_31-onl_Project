package Homework_7;

public class Surgeon extends Doctors{
    Surgeon(String doctorTypes, String doctorName) {
        super(doctorTypes, doctorName);
    }

    @Override
    void treatment() {
        System.out.println("Начинаем лечение по хирургическому направлению");
    }
}
