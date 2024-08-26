package Homework_7;

public class Dentist extends Doctors{
    Dentist(String doctorTypes, String doctorName) {
        super(doctorTypes, doctorName);
    }

    @Override
    void treatment() {
        System.out.println("Начинаем лечение по стоматологическому направлению");
    }
}
