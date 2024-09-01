package Homework_8;

public class Tiger extends Animals {
    public Tiger(String animalName, String animalType) {
        super(animalName, animalType);
    }

    @Override
    public void voice() {
        System.out.println("The tiger is roaring");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat"))
            System.out.println("I eat meat");
        else
            System.out.println("I won't eat it");
    }
}
