package Homework_7;

public class Therapist extends Doctors {


    Therapist(String doctorTypes, String doctorName) {
        super(doctorTypes, doctorName);
    }

    @Override
    void treatment() {
        super.treatment();
    }

    public static void chooseTreatmentPlan(Patient patient, Doctors[] clinic) {
        switch (enterTreatmentPlan()) {
            case 1 -> patient.setTreatment(1, clinic[0]);
            case 2 -> patient.setTreatment(2, clinic[1]);
            default -> patient.setTreatment(3, clinic[2]);
        }
        patient.getDoctor().treatment();
    }

    private static int enterTreatmentPlan() {
        System.out.println("Введите 1, если необходима консультация хирурга" + '\n' +
                "Введите 2, если необходима консультация дантиста" + '\n' +
                "Введите любую другую цифру, если необходима консультация терапевта");
        System.out.print("Введите число: ");
        return getScanner().nextInt();
    }
}

