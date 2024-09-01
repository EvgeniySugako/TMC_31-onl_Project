package Homework_8;

public class Rabbit extends Animals {
    public Rabbit(String animalName, String animalType) {
        super(animalName, animalType);
    }

    @Override
    public void voice() {
        System.out.println("Silent");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass"))
            System.out.println("I eat grass");
        else
            System.out.println("I won't eat it");
    }
}
