package Homework_8;
/*
Задача 1:
Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit. Переопределить методы voice(),
eat(String food) чтобы они выводили верную информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим туда “Grass” он должен написать
в консоли что любит есть травку. Если передадим “Meat” или другую строку то он будет недоволен.
Задача *:
Написать такой конструктор, который запретит создание объекта класса Dog в других классах; Найти способ вызывать
методы voice(), eat() класса Dog, который позволит обойти ограничение, наложенное конструктором выше. Объяснить,
как работают оба способа.
*/

public class MyMain {
    public static void main(String[] args) {

        Animals[] animals = new Animals[]{
                new Dog("Tuzik", "Dog"),
                new Tiger("Fred", "Tiger"),
                new Rabbit("Zay", "Rabbit"),
        };

        GuitarFender fenderGuitar = new GuitarFender("Jack", "Fender");
        fenderGuitar.onlyForGuitars();

        Instruments duduk = new Duduk("Goisha", "Duduk");
        duduk.getAdditionalData(new String[]{"One", "Two", "Three"});
        Instruments piano = new Piano("Depp", "Piano");
        piano.getAdditionalData(new String[]{"Klavier 1", "Klavier 2"});

        // Abstract methods

        // Interfaces
        // Interface as enum
        // Implementation vs. Realization
        // Interface as a multi-inheritance
        // Naming clashes
        // Marker interface
        // Function interface

        // Overload late-binding
    }

    // Instruments[] instruments
    public static void getInstruments(Instruments... instruments) {
        for (Instruments instrument : instruments) {
            System.out.println(instrument);
        }
    }
}
