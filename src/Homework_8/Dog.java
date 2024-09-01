package Homework_8;

public class Dog extends Animals {
    public Dog(String animalName, String animalType) {
        super(animalName, animalType);
    }

    @Override
    public void voice() {
        System.out.println("The dog barks!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat"))
            System.out.println("I eat meat");
        else
            System.out.println("I won't eat it");
    }
}