package Homework_7;

public class MyMain {
    public static void main(String[] args) {

        createClinic();
    }

    public static void createClinic() {
        Doctors[] clinic = new Doctors[]{
                new Surgeon("Surgeon", "Ivan", 38),
                new Therapist("Therapist", "Petr", 27),
                new Dentist("Dentist", "Pavel", 43),
        };
        for (Doctors doctor : clinic) {
            System.out.println(doctor.getDoctorFullInformation());
            doctor.treatment();
            System.out.println("_______________________________________________________________");
        }


    }
}
